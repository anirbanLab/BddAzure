package com.anirban.framework.selenium.bdd.runner;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com/anirban/framework/selenium/bdd/stepDef"},
        plugin= {"pretty", "json:target/cucumber-reports.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
       // plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
       // dryRun=true,
        monochrome=true
       
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests{
	
	/*
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
   */
}
