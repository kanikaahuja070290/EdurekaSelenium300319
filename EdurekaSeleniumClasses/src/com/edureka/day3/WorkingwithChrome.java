package com.edureka.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithChrome {

	ChromeDriver driver;
	
	public void invokeBrowse()
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\A2M0014\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://qatechhub.com");
	}
	
	public void getTitleOfThePage()
	{
		String titleOfThePage=driver.getTitle();
		System.out.println("Totle is:"+titleOfThePage);
	}
	public void navigateCommands()
	{
		driver.navigate().to("https://google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public void closeBrowser()
	{
		driver.quit();  //will close all the windows opened by selenium
		//driver.close(); will close only the current active window
	}
}
