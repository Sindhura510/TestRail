package com.qa.DDI_Project1.testscript;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.atmecs.falcon.automation.ui.selenium.Click;
import com.atmecs.falcon.automation.ui.selenium.TextField;
import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;
import com.qa.DDI.Project1.JiraUtils.JiraPolicy;
import com.qa.DDI.Project1.TestRailUtil.TestRails;
import com.qa.DDI_Project1.constant.FilePathConstants;
import com.qa.DDI_Project1.constant.LocatorKeyContainer;
import com.qa.DDI_Project1.testsuite.SampleTestSuiteBase;
import com.atmecs.locatorSmartFixTool.models.SmartFixPageFileHandler;

public class AtmecsContactUsTest extends SampleTestSuiteBase {
	private ReportLogService report = new ReportLogServiceImpl(AtmecsContactUsTest.class);
	
	String url = "http://www.atmecs.com/";
    
	@Test
    @TestRails(id="11")
	@JiraPolicy(logTicketReady=true)
	public void contactUsTest() {
		//browser.openURL(url, os, osVersion, br, browserVersion);
		browser.openURL(url, "Windows", "90.2","chrome", "90");
		browser.maximizeWindow();
		
		Click click = browser.getClick();
		report.info("executing exploreTest ");
		click.waitandclick(LocatorType.XPATH,
				SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.CONTACT_US_LINK),
				3000);
		TextField enterText = browser.getTextField();
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_1),  "Maximillian");
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_2),  "max@gmail.com");
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_3),  "9789549405");
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_4),  "Max insurance");
		
	}
	
	
	@Test
    @TestRails(id="11")
	@JiraPolicy(logTicketReady=true)
	public void contactUsTestFail1() {
		//browser.openURL(url, os, osVersion, br, browserVersion);
		browser.openURL(url, "Windows", "90.2","chrome", "90");
		browser.maximizeWindow();
		
		Click click = browser.getClick();
		report.info("executing exploreTest ");
		click.waitandclick(LocatorType.XPATH,
				SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.CONTACT_US_LINK),
				3000);
		TextField enterText = browser.getTextField();
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_1),  "Maximillian");
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_2),  "max@gmail.com");
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_3),  "9789549405");
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_4),  "Max insurance");
		 Assert.assertEquals("hhghg", "uiuiui");
	}
	
	
	@Test
    @TestRails(id="11")
	@JiraPolicy(logTicketReady=true)
	public void contactUsTestFail2() {
		//browser.openURL(url, os, osVersion, br, browserVersion);
		browser.openURL(url, "Windows", "90.2","chrome", "90");
		browser.maximizeWindow();
		
		Click click = browser.getClick();
		report.info("executing exploreTest ");
		click.waitandclick(LocatorType.XPATH,
				SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.CONTACT_US_LINK),
				3000);
		TextField enterText = browser.getTextField();
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_1),  "Maximillian");
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_2),  "max@gmail.com");
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_3),  "9789549405");
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_4),  "Max insurance");
		 Assert.assertEquals("hutut", "uiuiui");
	}
	
	@Test
    @TestRails(id="11")
	@JiraPolicy(logTicketReady=true)
	public void contactUsTestFail3() {
		//browser.openURL(url, os, osVersion, br, browserVersion);
		browser.openURL(url, "Windows", "90.2","chrome", "90");
		browser.maximizeWindow();
		
		Click click = browser.getClick();
		report.info("executing exploreTest ");
		click.waitandclick(LocatorType.XPATH,
				SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.CONTACT_US_LINK),
				3000);
		TextField enterText = browser.getTextField();
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_1),  "Maximillian");
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_2),  "max@gmail.com");
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_3),  "9789549405");
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_4),  "Max insurance");
		 Assert.assertEquals("hu", "uiuiui");
	}
	
	@Test
    @TestRails(id="11")
	@JiraPolicy(logTicketReady=true)
	public void contactUsTestFail4() {
		//browser.openURL(url, os, osVersion, br, browserVersion);
		browser.openURL(url, "Windows", "90.2","chrome", "90");
		browser.maximizeWindow();
		
		Click click = browser.getClick();
		report.info("executing exploreTest ");
		click.waitandclick(LocatorType.XPATH,
				SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.CONTACT_US_LINK),
				3000);
		TextField enterText = browser.getTextField();
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_1),  "Maximillian");
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_2),  "max@gmail.com");
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_3),  "9789549405");
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_4),  "Max insurance");
		 Assert.assertEquals("hu", "uiuiui");
	}
}
