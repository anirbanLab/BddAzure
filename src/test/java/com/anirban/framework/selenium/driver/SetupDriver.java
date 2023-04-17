package com.anirban.framework.selenium.driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SetupDriver {

	
	private static WebDriver driver=null;

	public static WebDriver getDriver(String sbrowser, String sMode,String server) throws MalformedURLException {

		ChromeOptions chOPt;
		FirefoxOptions ffOPt;
		EdgeOptions edgOPt;
		
		//System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:/drivers/edgedriver.exe");

		if(sbrowser.equalsIgnoreCase("chrome")) {
			chOPt=new ChromeOptions();
			chOPt.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");
			chOPt.setAcceptInsecureCerts(true);
			chOPt.addArguments("start-maximized");	
			if(sMode.equalsIgnoreCase("GRID")) 
				driver=new RemoteWebDriver(new URL(server), chOPt);
			else 
				driver=new ChromeDriver(chOPt);
				
			return driver;
		}
		else if(sbrowser.equalsIgnoreCase("firefox")) {
			ffOPt=new FirefoxOptions();
			ffOPt.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			ffOPt.setAcceptInsecureCerts(true);
			//ffOPt.set
			ffOPt.addArguments("start-maximized");	
			if(sMode.equalsIgnoreCase("GRID"))
				driver= new RemoteWebDriver(new URL(server),ffOPt );
			else
				driver= new FirefoxDriver(ffOPt);
			
			return driver;
		}
		else if(sbrowser.equalsIgnoreCase("edge")) {
			edgOPt=new EdgeOptions();
			edgOPt.setAcceptInsecureCerts(true);
			if(sMode.equalsIgnoreCase("GRID"))
				driver= new RemoteWebDriver(new URL(server),edgOPt );
			else
				driver= new EdgeDriver(edgOPt);
			
			System.out.println(""+ (driver==null));
			
			return driver;
		}



		return null;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void quitDriver() {
		driver.quit();
	}


	public static void closeDriver() {
		driver.close();
	}
}
