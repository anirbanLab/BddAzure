package com.anirban.framework.selenium.bdd.stepDef;

import java.net.MalformedURLException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.anirban.framework.selenium.core.GetElement;
import com.anirban.framework.selenium.driver.SetupDriver;

public class TestConcepts {

	public static void main(String[] args) throws MalformedURLException {

		//System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver.exe");
		//FirefoxOptions opts=new FirefoxOptions();
		//opts.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		//WebDriver driver= new FirefoxDriver(opts);

		WebDriver driver=SetupDriver.getDriver("chrome", "standalone", "");
		driver.get("https://www.google.com/");
		driver.switchTo().frame("callout");
		WebElement button=GetElement.getElementhWithImplecitWait(300,driver, "//*[@class=\"QlyBfb\"]/button", "xpath");
		button.click();
		driver.switchTo().defaultContent();
		GetElement.getElementhWithImplecitWait(300,driver, "q", "name").sendKeys("Selenium-Java");
		
		new Actions(driver)
                .keyDown(Keys.ENTER)
                .perform();
		
		System.out.println("----> "+driver.getTitle());
		
		SetupDriver.quitDriver();
	}
}