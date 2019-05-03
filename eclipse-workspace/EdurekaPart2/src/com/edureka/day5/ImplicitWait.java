package com.edureka.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWait {

		WebDriver driver;
		
		public void invokeBrowser()
		{
		System.setProperty("webdriver.chrome.driver", 
				"\\C:\\Users\\A2M0014\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//div[@class='_2ISNhP _3AOFWO']//button")).click();
		}
	

	public void mouseHover()
	{
		WebElement electronicsLink = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions action =new Actions(driver);
		action.moveToElement(electronicsLink).build().perform();
		
		WebElement samsungLink=driver.findElement(By.xpath("(//a[text()='Samsung'])[1]"));
		action.moveToElement(samsungLink).click().build().perform();
	}
	}

