package com.edureka.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Flipkart_Login {
	ChromeDriver driver;
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				"\\C:\\Users\\A2M0014\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		
	}

	public void login()
	{
		driver.findElement(By.className("_2zrpKA")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'_2AkmmA _1LctnI _7UHT_c')]")).click(); //dynamic xpath
		driver.findElement(By.xpath("//button[contains(@class,'_2AkmmA _29YdH8')]")).click();
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
}
