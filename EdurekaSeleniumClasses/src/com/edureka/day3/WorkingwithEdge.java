package com.edureka.day3;

import org.openqa.selenium.edge.EdgeDriver;

public class WorkingwithEdge {
	EdgeDriver driver;
	
	public void invokeBrowser() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\A2M0014\\drivers\\MicrosoftEdge\\MicrosoftWebDriver.exe");
		driver=new EdgeDriver();	
		driver.manage().window();
		driver.manage().deleteAllCookies();
		driver.get("https://qatechhub.com");
	}
	
	public void getTitleOfThePage()
	{
	String tileOfThePage=driver.getTitle();
	System.out.println("Title is:"+tileOfThePage);
	}
	
	public void navigateCommands()
	{
		driver.navigate().to("https://google.com");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
	}
	
	public void closeBrowser()
	{
		driver.quit();  //will close all the windows opened by selenium
		//driver.close(); will close only the current active window
	}
}
