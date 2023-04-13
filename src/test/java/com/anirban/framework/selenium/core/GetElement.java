package com.anirban.framework.selenium.core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class GetElement {

	@SuppressWarnings({"unchecked", "deprecation","unused"})
	public static WebElement getElementhWithFluidWait(int duration,int pollInterval, WebDriver driver, String locator,String locatorType) {
		Wait wait=new FluentWait(driver).withTimeout(Duration.ofSeconds(duration))
				.pollingEvery(Duration.ofMillis(pollInterval))
				.ignoring(Exception.class);

       //log finding element by..
		WebElement element=(WebElement) wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				if(locatorType.equalsIgnoreCase("xpath"))
					return driver.findElement(By.xpath(locator));
				else if(locatorType.equalsIgnoreCase("id"))
					return driver.findElement(By.id(locator));
				else if(locatorType.equalsIgnoreCase("name"))
					return driver.findElement(By.name(locator));
				else if(locatorType.equalsIgnoreCase("linkText"))
					return driver.findElement(By.linkText(locator));
				else if(locatorType.equalsIgnoreCase("partialLinkText"))
					return driver.findElement(By.partialLinkText(locator));

				return null;
			}
		});
		
		//log element found...
		//not found will throw error..
		return element;
	}

	
	  @SuppressWarnings({"unchecked", "deprecation","unused"}) public static
	  WebElement getElementhWithImplecitWait(int duration,WebDriver driver, String
	  locator,String locatorType) {
	  
	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(duration));
	  
	  //log finding element by..
		WebElement element=(WebElement) wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				if(locatorType.equalsIgnoreCase("xpath"))
					return driver.findElement(By.xpath(locator));
				else if(locatorType.equalsIgnoreCase("id"))
					return driver.findElement(By.id(locator));
				else if(locatorType.equalsIgnoreCase("name"))
					return driver.findElement(By.name(locator));
				else if(locatorType.equalsIgnoreCase("linkText"))
					return driver.findElement(By.linkText(locator));
				else if(locatorType.equalsIgnoreCase("partialLinkText"))
					return driver.findElement(By.partialLinkText(locator));

				return null;
			}
		});
		
		//log element found...
		//not found will throw error..
		return element;
	  }
	 
}
