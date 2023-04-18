package com.anirban.framework.selenium.bdd.stepDef;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.anirban.framework.selenium.core.GetElement;
import com.anirban.framework.selenium.driver.SetupDriver;

import io.cucumber.core.backend.Container;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStepDef {

	WebDriver driver;
	String searchString="";
	@Given("The user launches google page.")
	public void the_user_launches_google_page() {
		try {
			driver=SetupDriver.getDriver("edge", "GRID", "http://localhost:4444/wd/hub");
			//driver=SetupDriver.getDriver("chrome", "standalone", "");
			//EdgeOptions edgOPt=new EdgeOptions();
			//edgOPt.setAcceptInsecureCerts(true);
			//driver =new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), edgOPt);
		}catch(Exception exp) {
			exp.printStackTrace();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		//additional step for not choosing an existing user.
		driver.switchTo().frame("callout");
		WebElement button=GetElement.getElementhWithImplecitWait(300,driver, "//*[@class=\"QlyBfb\"]/button", "xpath");
		button.click();
		driver.switchTo().defaultContent();
	}

	@When("The user enters {string}.")
	public void the_user_enters(String string) {
		searchString=string;
		GetElement.getElementhWithImplecitWait(300,driver, "q", "name").sendKeys(string);
	}

	@When("user clicks the go button.")
	public void user_clicks_the_go_button() {
		new Actions(driver)
		.keyDown(Keys.ENTER)
		.perform();
	}

	@Then("User gets into the result page.")
	public void user_gets_into_the_result_page() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(2000));
		String s=driver.getTitle();
		System.out.println("Page title: "+s);
		//Assert.assertEquals(true, false);
		//Assert.assertEquals(s, searchString);
	}
	
}
