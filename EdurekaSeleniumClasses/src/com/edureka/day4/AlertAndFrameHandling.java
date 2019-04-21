package com.edureka.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndFrameHandling {
	ChromeDriver driver;
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", 
				"\\C:\\Users\\A2M0014\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.tagName("button")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println("Alert Message:"+alert.getText());
		alert.accept();
		
		//switch back to main window
		driver.switchTo().defaultContent();
	}
	

}
