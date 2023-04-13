package com.anirban.framework.testng.scenario.sn1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.anirban.framework.testng.report.ExtentTestFactory;
import com.anirban.framework.testng.util.Assert;
import com.aventstack.extentreports.Status;

public class BaseTest {

	@BeforeSuite
	public void setup() {
		System.out.println("Here goes Extent report setup.");
		ExtentTestFactory.initReport("ExecutiveSummeryReport.html");
		ExtentTestFactory.getExtentTest("Setup").log(Status.INFO,"Starting the SUIT");
		ExtentTestFactory.getExtentTest().pass("===Setup done successfully===");
	}

	@AfterSuite
	public void cleanup() {
		ExtentTestFactory.flush();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("---beforeMethod--");
		Assert.assertInit();
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("---afterMethod--");

	}
}
