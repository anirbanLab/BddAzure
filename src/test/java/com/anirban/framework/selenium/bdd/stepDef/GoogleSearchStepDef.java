package com.anirban.framework.selenium.bdd.stepDef;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.anirban.framework.selenium.core.GetElement;
import com.anirban.framework.selenium.driver.SetupDriver;
import com.anirban.framework.testng.util.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStepDef {

	WebDriver driver;
	String searchString="";
	@Given("The user launches google page.")
	public void the_user_launches_google_page() {
		try {
			driver=SetupDriver.getDriver("chrome", "standalone", "");
		}catch(Exception exp) {
			exp.printStackTrace();
		}
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
		Assert.contains(Assert.HARD, searchString, s);
	}
}
