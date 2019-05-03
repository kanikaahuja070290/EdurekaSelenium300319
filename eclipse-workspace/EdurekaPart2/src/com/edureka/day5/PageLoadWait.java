package com.edureka.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadWait {
	
	WebDriver driver;
	
	public void invokeBrowser()
	{
	System.setProperty("webdriver.chrome.driver", 
			"\\C:\\Users\\A2M0014\\drivers\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com");
	}
}
