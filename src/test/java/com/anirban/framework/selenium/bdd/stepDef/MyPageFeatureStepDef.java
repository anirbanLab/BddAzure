package com.anirban.framework.selenium.bdd.stepDef;

import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

//import com.anirban.framework.testng.util.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyPageFeatureStepDef {

	@Given("The user launches the login page.")
	public void the_user_launches_the_login_page() {
      // ExtentCucumberAdapter.addTestStepLog("--------------- Launching the login page --------------------");
       ExtentCucumberAdapter.getCurrentStep().log(Status.INFO, "My Log 1");  
       ExtentCucumberAdapter.getCurrentStep().log(Status.WARNING, "My Log 1");
	}
	@Given("The user enters {string} and {string}.")
	public void the_user_enters_and(String string, String string2) {
//	  Assert.assertEquals(false, true);
	}
	@When("user clicks the login button.")
	public void user_clicks_the_login_button() {
	}
	@Then("User gets into the home page.")
	public void user_gets_into_the_home_page() {
		Assert.assertEquals(true, true);
	}
	@Then("User do not get into the home page.")
	public void user_do_not_get_into_the_home_page() {
		//take screen shot and attache it to the report.
		Assert.assertEquals(true, true);
	}
}
