 package com.qa.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org .openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.ReadProperties;

public class Base {
	
	public static WebDriver driver;
	
	public WebDriver initializeWebDriver() throws IOException {

	      System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

			// Start the Browser

			driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(ReadProperties.implicitWaitTime(), TimeUnit.SECONDS);

			driver.manage().window().maximize();

			driver.get(ReadProperties.getappURL());

			return driver;
			

	 }
	
	public void closeBrowser() {

	//	driver.quit();

	}

}
