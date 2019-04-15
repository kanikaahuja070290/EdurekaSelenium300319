package com.edureka.assignments.CaseStudy1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class edurekaLogin {
	WebDriver driver;

	
	public void invokeBrowser(String browser)
	{
		//  with  different  browsers 
		if(browser.equalsIgnoreCase("chrome")) 
		{
		System.setProperty("webdriver.chrome.driver",
				"\\C:\\Users\\A2M0014\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		}
		
		else
		{
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\A2M0014\\drivers\\Firefox\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		//maximize the window
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.edureka.co/");
		
		//Inspect the "search box"
		driver.findElement(By.xpath("//input[@id='search-inp']")).sendKeys("Search for a Course");
		
		//Inspect the “Log In” Link
		driver.findElement(By.linkText("Log In")).click();
		
		//get all the element attributes are found on the webpage
		List<WebElement>  elements= driver.findElements(By.xpath("//*"));
		for (WebElement ele:elements)
		{
			System.out.println(ele.getTagName() + ":" +ele.getText());
		}
			
		}
	
	public void closeBrowser()
	{
		driver.close();
	}

}
