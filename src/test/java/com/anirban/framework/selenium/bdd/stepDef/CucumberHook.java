package com.anirban.framework.selenium.bdd.stepDef;

import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.anirban.framework.selenium.driver.SetupDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class CucumberHook {

	//@Before
	public void setUP() throws MalformedURLException {
		System.out.println("Settingup the test !!");
		WebDriver driver=SetupDriver.getDriver("chrome", "STANDANOLE", "");
		driver.get("https://google.com");
	}
	
	 @After
	    public static void tearDown(Scenario scenario) {
	        //validate if scenario has failed
	        if(scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot)SetupDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName()); 
	        }      
	       SetupDriver.quitDriver();
	    }
	    //@AFter
}
