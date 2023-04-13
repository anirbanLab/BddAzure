package com.anirban.framework.testng.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentTestFactory {

	private static ExtentTest test;
	private static ExtentReports extent ;
	
	public static void initReport(String filename) {
		extent= new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(filename);
		//extent.
		extent.attachReporter(spark);
	}

	public static ExtentTest getExtentTest(String testName) {
		//if(test == null){
			test=extent.createTest(testName);
		//}
		return test;
	}
	
	public static ExtentTest getExtentTest() {
		return test;
	}
	
	public static void removeTest(String testName) {
		extent.removeTest(testName);
	}
	
	public static void flush() {
		extent.flush();
	}
}


