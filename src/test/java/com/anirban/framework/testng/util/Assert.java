package com.anirban.framework.testng.util;

import org.testng.asserts.SoftAssert;

import com.anirban.framework.testng.report.ExtentTestFactory;

public class Assert {

	public static String HARD="hard";
	public static String SOFT="soft";
    private static SoftAssert asrt;
	
	public static void equalIngonreCase(String assertType, String expected, String actual) throws AssertionError{
      
		String s="Assertion failED: Expected - |"+expected+"| Actual -|"+actual+"|";
		String s2="Assertion passED: Expected - |"+expected+"| Actual -|"+actual+"|";
		if(!expected.equalsIgnoreCase(actual)) {
			if(assertType.equalsIgnoreCase("hard")) {
				ExtentTestFactory.getExtentTest().fail(s);
				throw new AssertionError(s);
			}else {
				
				ExtentTestFactory.getExtentTest().fail(s);
			}
		}else {
			ExtentTestFactory.getExtentTest().pass(s2);
		}
	}

	public static void contains(String assertType, String expected, String actual) throws AssertionError{
	      
		String s="Assertion failED: Expected - |"+expected+"| is not present in Actual -|"+actual+"|";
		String s2="Assertion passED: Expected - |"+expected+"| is present in Actual -|"+actual+"|";
		if(!actual.contains(expected)) {
			if(assertType.equalsIgnoreCase("hard")) {
				ExtentTestFactory.getExtentTest().fail(s);
				throw new AssertionError(s);
			}else {
				ExtentTestFactory.getExtentTest().fail(s);
			}
		}else {
			ExtentTestFactory.getExtentTest().pass(s2);
		}
	}

	public static void equal(String assertType, String expected, String actual) throws AssertionError{
	      
		String s="Assertion failED: Expected - |"+expected+"| Actual -|"+actual+"|";
		String s2="Assertion passED: Expected - |"+expected+"| Actual -|"+actual+"|";
		if(!expected.equalsIgnoreCase(actual)) {
			if(assertType.equalsIgnoreCase("hard")) {
				ExtentTestFactory.getExtentTest().fail(s);
				throw new AssertionError(s);
			}else {
				
				ExtentTestFactory.getExtentTest().fail(s);
			}
		}else {
			ExtentTestFactory.getExtentTest().pass(s2);
		}
	}
	
	public static void equal(String assertType, int expected, int actual) throws AssertionError{
	      
		String s="Assertion failED: Expected - |"+expected+"| Actual -|"+actual+"|";
		String s2="Assertion passED: Expected - |"+expected+"| Actual -|"+actual+"|";
		if(expected!=actual) {
			if(assertType.equalsIgnoreCase("hard")) {
				ExtentTestFactory.getExtentTest().fail(s);
				throw new AssertionError(s);
			}else {
				ExtentTestFactory.getExtentTest().fail(s);
			}
		}else {
			ExtentTestFactory.getExtentTest().pass(s2);
		}
	}
	
	public static void equal(String assertType, boolean expected, boolean actual) throws AssertionError{
	      
		String s="Assertion failED: Expected - |"+expected+"| Actual -|"+actual+"|";
		String s2="Assertion passED: Expected - |"+expected+"| Actual -|"+actual+"|";
		if(expected != actual) {
			if(assertType.equalsIgnoreCase("hard")) {
				ExtentTestFactory.getExtentTest().fail(s);
				throw new AssertionError(s);
			}
			else {
				asrt.assertEquals(actual, expected);
				ExtentTestFactory.getExtentTest().fail(s);
			}
		}else {
			ExtentTestFactory.getExtentTest().pass(s2);
		}
	}
	
	public static void assertAll() {
		asrt.assertAll();
	}
	
	public static void assertInit() {
		asrt=new SoftAssert();
	}
	
}
