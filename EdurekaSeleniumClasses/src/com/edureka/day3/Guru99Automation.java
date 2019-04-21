package com.edureka.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Automation {
	ChromeDriver driver;
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				"\\C:\\Users\\A2M0014\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/v4/");
	}
	
	public void login()
	{
		driver.findElement(By.name("uid")).sendKeys("mngr188825");
		driver.findElement(By.name("password")).sendKeys("ybUhErU");
		driver.findElement(By.name("btnLogin")).click();
	}
	
	public void addCustomer()
	{
		
		driver.findElement(By.linkText("New Customer")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("kanika");
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.findElement(By.name("dob")).sendKeys("10-04-2019");
		driver.findElement(By.name("addr")).sendKeys("Flatno302");
		driver.findElement(By.name("city")).sendKeys("Gurgaon");
		driver.findElement(By.name("state")).sendKeys("Haryana");
		driver.findElement(By.name("pinno")).sendKeys("122016");
		driver.findElement(By.name("telephoneno")).sendKeys("1234567890");
		
		String emailID="qwerty"+System.currentTimeMillis()+"mail.com"; //unique email id
		driver.findElement(By.name("emailid")).sendKeys(emailID);
		driver.findElement(By.name("password")).sendKeys("abc");
		driver.findElement(By.name("sub")).click();
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
}
