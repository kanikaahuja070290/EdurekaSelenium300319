package com.edureka.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class guru99ProjectUsingTestng {
	WebDriver driver;
	
	@Parameters("browsertype")
	@BeforeClass
	public void invokeBrowser(String browserType) {
		if (browserType.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\A2M0014\\drivers\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browserType.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\A2M0014\\drivers\\MicrosoftEdge\\MicrosoftWebDriver.exe");

			driver = new EdgeDriver();

		} else if (browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\A2M0014\\drivers\\Firefox\\geckodriver-v0.24.0-win64\\geckodriver.exe");

			driver = new FirefoxDriver();
		}
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/v4/");
		
	}

	@Test
	public void verifyTitleofthePage()
	{
		String titleOfThePage=driver.getTitle();
		System.out.println("Title of the Page :"+titleOfThePage);
		
		Assert.assertEquals(titleOfThePage, "Guru99 Bank Home Page");
	}
	
	@Parameters({"userid","userPassword"})
	@Test
	public void verifyLoginToGuru99(String userId,String userpwd)
	{
		
		WebElement userIDElement;
		userIDElement=driver.findElement(By.name("uid"));
		userIDElement.sendKeys(userId);
		driver.findElement(By.name("password")).sendKeys(userpwd);
		driver.findElement(By.name("btnLogin")).click();
		
		String managerIdText = driver.findElement(By.xpath("//td[contains(text(),'Manger Id :')]")).getText();
		String actualManagerId=managerIdText.split(":")[1].trim();
		Assert.assertEquals(actualManagerId, userId);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
