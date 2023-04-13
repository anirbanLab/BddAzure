package com.anirban.framework.testng.scenario.sn1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1 {

	SoftAssert asrt=new SoftAssert();
	
	
	@Test (alwaysRun=true,priority=4)  //, dependsOnMethods= {"mytestTwo","mytestThree","mytestFour"}
	public void mytestOne() {
		asrt.assertEquals(true, true);
		asrt.assertAll();
	}
	
	@Test (alwaysRun=true,priority=3)  //,dependsOnMethods= {"mytestThree","mytestFour"})
	public void mytestTwo(){
		asrt.assertEquals(false, true);
		asrt.assertEquals(true, true);
		gotoSleep(10000);
		asrt.assertAll();
		
	}
	
	@Test (alwaysRun=true,priority=2)  //,, dependsOnMethods= {"mytestFour"})
	public void mytestThree() {
		asrt.assertEquals(true, true);
		asrt.assertEquals(true, true);
		gotoSleep(10000);
		asrt.assertAll();
	}
	
	@Test (priority=1)  //,
	public void mytestFour() {
		asrt.assertEquals(true, true);
		asrt.assertEquals(true, true);
		gotoSleep(10000);
		asrt.assertAll();
	}
	
	private void gotoSleep(int time){
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@BeforeClass
	  public void beforeClass() {
		  System.out.println("---beforeClass--");  
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("---afterClass--");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("---beforeTest--");
		 
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("---afterTest--");
	  }

}