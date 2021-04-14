/***
 *
 */
package com.qa.DDI_Project1.testsuite;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.atmecs.falcon.automation.ui.selenium.Browser;
import com.qa.DDI.Project1.TestRailUtil.APIClient;
import com.qa.DDI.Project1.TestRailUtil.APIException;
import com.qa.DDI.Project1.TestRailUtil.TestRails;
import com.qa.DDI_Project1.testscript.AtmecsContactUsTest;

public class SampleTestSuiteBase {
	public Browser browser;

	 String PROJECT_ID = "1";
	APIClient client = null;
	    

	@BeforeClass
	public void preSetup() {
		browser = new Browser();
	}

	@AfterTest
	public void teardown() {
		browser.closeBrowser();
	}
	
	@BeforeSuite
	public void createSuite(ITestContext ctx) throws IOException, APIException {
		client = new APIClient("https://mudisindhura.testrail.io");
		client.setUser("mudisindhura@gmail.com");
		client.setPassword("7330791090@Sragvi");
		Map data = new HashMap();
		data.put("include_all",true);
		data.put("name","Test Run "+System.currentTimeMillis());
		JSONObject c = null;
		c = (JSONObject)client.sendPost("add_run/"+PROJECT_ID,data);
		Long suite_id = (Long)c.get("id");
		ctx.setAttribute("suiteId",suite_id);

	}
	
	
	@BeforeMethod
	public void beforeTest(ITestContext ctx,Method method) throws NoSuchMethodException {
		Method m = AtmecsContactUsTest.class.getMethod(method.getName());
		

		if (m.isAnnotationPresent((Class<? extends Annotation>) TestRails.class)) {
			TestRails ta = m.getAnnotation(TestRails.class);
			System.out.println(ta.id());
			ctx.setAttribute("caseId",ta.id());
		}
	}
	
	@AfterMethod
	public void afterTest(ITestResult result, ITestContext ctx) throws IOException, APIException {
		Map data = new HashMap();
		if(result.isSuccess()) {
			data.put("status_id",1);
		}
		else {
			data.put("status_id", 5);
			data.put("comment", result.getThrowable().toString());
		}

		String caseId = (String)ctx.getAttribute("caseId");
		Long suiteId = (Long)ctx.getAttribute("suiteId");
		client.sendPost("add_result_for_case/"+suiteId+"/"+caseId,data);

	}

}