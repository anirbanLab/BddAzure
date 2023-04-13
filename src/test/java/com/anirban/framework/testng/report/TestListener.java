package com.anirban.framework.testng.report;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ExtentTestFactory.getExtentTest(result.getName()).info("Starting test with name: "+result.getName()+" at "+result.getStartMillis());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ExtentTestFactory.getExtentTest().pass("Test PASS with name: "+result.getName()+" at "+result.getEndMillis());
		//ExtentTestFactory.removeTest(result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ExtentTestFactory.getExtentTest().fail("Test Fail with name: "+result.getName()+" at "+result.getEndMillis());
		//ExtentTestFactory.removeTest(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ExtentTestFactory.getExtentTest().warning("Test Skipped with name: "+result.getName()+" at "+result.getEndMillis());
		//ExtentTestFactory.removeTest(result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
