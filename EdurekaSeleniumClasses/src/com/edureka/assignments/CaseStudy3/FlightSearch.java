package com.edureka.assignments.CaseStudy3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlightSearch {
	WebDriver driver;

	public void invokeBrowser()
	{
		//Launch Chrome browser
		System.setProperty("webdriver.chrome.driver",
				"\\C:\\Users\\A2M0014\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.goindigo.in/?linkNav=home_header");
		driver.findElement(By.xpath("//label[text()='One Way']")).click();
		
		//filling the details
		
		WebElement source=driver.findElement(By.xpath("//input[@name='or-src']"));
		source.sendKeys("Bengaluru");
		source.sendKeys(Keys.ENTER);
		
		WebElement destination=driver.findElement(By.xpath("//input[@name='or-dest']"));
		destination.sendKeys("Lucknow");
		destination.sendKeys(Keys.ENTER);
		
		//click on calendar
		
		driver.findElement(By.xpath("(//input[@name='or-depart'])[1]")).click();
		Actions a=new Actions(driver);
		WebElement cal=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[@class=' ui-datepicker-week-end selected-date ui-datepicker-current-day']"));
		a.moveToElement(cal).click().build().perform();
		
		//enter passenger
		driver.findElement(By.name("passenger")).click();
		WebElement adult=driver.findElement(By.xpath("(//li[@class='adult-pax-list'])[2]//button[@title='Up']"));
		a.moveToElement(adult).click().build().perform();
		a.moveToElement(adult).click().build().perform();
		a.moveToElement(adult).click().build().perform();
		
		WebElement children=driver.findElement(By.xpath("(//li[@class='child-pax-list'])[2]//button[@title='Up']"));
		a.moveToElement(children).click().build().perform();
		a.moveToElement(children).click().build().perform();
		
		//driver.findElement(By.xpath("//div[@class='passenger-dropdown pax-selection-row']//button[text()='Done']")).click();
	
		
		driver.findElement(By.xpath("//button[@type='submit']/span[text()='Search Flight']")).click();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		List<WebElement> allFlights=driver.findElements(By.xpath("//div[@class='row trips-row d-none d-flex']"));
		for(WebElement flights:allFlights)
		{
			System.out.println(flights.getText());
			System.out.println("--------------------------------------");
		}
		
		
}
	
	public void closeBrowser()
	{
		driver.quit();
	}
	}
