package CaseStudyTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EdurekaTestNG {
	WebDriver driver;
	
	@BeforeClass
	public void invokeBrowser()
	{
	System.setProperty("webdriver.chrome.driver",
			"\\C:\\Users\\A2M0014\\drivers\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.get("https://www.edureka.co/");
	
	}
	
	@Test
	public void loginEdureka()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Log In")).click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Actions a=new Actions(driver);
		//WebElement alert=driver.findElement(By.xpath("//div[@id='exitpop_mode']//button[@class='close close_exit_popup'][1]"));
	//	a.moveToElement(alert).build().perform();
		//a.click();
		//driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.xpath("//div[@class='inputfld'][1]/input[@id='sg_popup_email']")).sendKeys("kanikaahuja070290");
		driver.findElement(By.xpath("//div[@class='inputfld']/input[@id='si_popup_passwd']")).sendKeys("123456789");
	}
	
	/*@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}*/
}
