package com.edureka.assignments.CaseStudy2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



	public class Waits {
	WebDriver driver;

	public void invokeBrowser()
	{
		//Launch Chrome browser
		System.setProperty("webdriver.chrome.driver",
				"\\C:\\Users\\A2M0014\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		Actions action=new Actions(driver);
	
	
	// page load timeout 
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.get("https://www.edureka.co/");
	
	//Maximize the Browser Window
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	// implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Search for “Selenium” course  and press “Enter”
	 WebElement searchBox=driver.findElement(By.id("search-inp"));
	 searchBox.sendKeys("Selenium");
	 searchBox.sendKeys(Keys.ENTER);
	 
	 WebElement seleniumLink=driver.findElement(By.xpath("(//div[@class='courseinfo']//div[@class='textinfoleft'])[2]"));
	 waitTillElementVisible(10, By.xpath("(//div[@class='courseinfo']//div[@class='textinfoleft'])[2]"));
	 action.moveToElement(seleniumLink).build().perform();
	 seleniumLink.click();
	 
	 //get the title
	 String actualTitle=driver.getTitle();
	 System.out.println("Title is:"+actualTitle);
	 String expectedTitle="Selenium 3.0 WebDriver Online Training";
	 System.out.println("Expected Title is:"+expectedTitle);
	 if(actualTitle.equals(expectedTitle))
	 {
		 System.out.println("Title matched");
	 }	
	 else
	 {
		 System.out.println("Title Mismatched");
	 }
	 
	 //Navigate back
	 driver.navigate().back();
	 driver.navigate().back();
	 
	 waitTillElementVisibleWithFluentWait(30, By.linkText("Browse all courses"), 1);
	 driver.findElement(By.linkText("Browse all courses")).click();
	//waitTillElementVisibleWithFluentWait(10, By.linkText("Browse all courses"), 1);
	 
	 
	}
	
	// explicit wait for page 
	private void waitTillElementVisible(int timeOutInSeconds , By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	// fluent wait
	private void waitTillElementVisibleWithFluentWait(int timeOutInSeconds, By locator, int pollingTime) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOutInSeconds))
				.pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
	
	}
