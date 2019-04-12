package com.edureka.day3;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_facebookLoginAndPost {
	ChromeDriver driver;
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				"\\C:\\Users\\A2M0014\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
	}

	public void Login()
	{
		driver.findElement(By.name("email")).sendKeys("kanikaahuja070290@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("app2mobile");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		//Alert alert=driver.switchTo().alert();
		//alert.accept();
		

	}
	
	public void post()
	{
		driver.findElement(By.xpath("//div[contains(@class,'_1mwp navigationFocus _395 _1mwq _4c_p _5bu_ _3t-3 _34nd _21mu _5yk1')]")).sendKeys("abcd");
		driver.findElement(By.xpath("//button[@type='submit' and @data-testid='react-composer-post-button']")).click();
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
}
