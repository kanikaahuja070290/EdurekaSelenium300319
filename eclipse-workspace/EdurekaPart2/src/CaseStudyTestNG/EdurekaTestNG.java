package CaseStudyTestNG;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	driver.get("https://www.edureka.co/");
	
	}
	
	@Test(priority=0,enabled=true)
	public void loginEdureka()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Log In")).click();
		WebElement element=driver.findElement(By.xpath("//*[@id=\"si_popup_email\"]"));
		waitTillElementVisble(30,By.xpath("//*[@id=\"si_popup_email\"]"));
		element.sendKeys("kanikaahuja@outlook.com");
		driver.findElement(By.xpath("//div[@class='inputfld']/input[@id='si_popup_passwd']")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	}
	
	private void waitTillElementVisble(int timeOutInSeconds, By locator) 
	{

		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
	private void waitTillElementClickable(int timeOutInSeconds, By locator) 
	{

		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(locator));

	}
	@Test(priority=3000,enabled=true)
	public void browseCourse()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Courses")));
		element.click();
		driver.findElement(By.linkText("All Courses")).click();
	}
	
	@Test(priority=4000,enabled=true)
	public void logout() 
	{	
		WebElement element = driver.findElement(By.xpath("//li[@class='dropdown userdrop hidden-lg hidden-md profile-pic-header']"));
		waitTillElementClickable(30, By.xpath("//li[@class='dropdown userdrop hidden-lg hidden-md profile-pic-header']"));
		element.click();
		driver.findElement(By.linkText("Log Out")).click();
	}
	
	@Test(priority=5000,enabled=true)
	public void register()
	{
		driver.findElement(By.linkText("Sign Up")).click();
		WebElement signupModal= driver.findElement(By.xpath("//*[@id=\"sg_popup_email\"]"));
		waitTillElementVisble(60,By.xpath("//*[@id=\"sg_popup_email\"]"));
		signupModal.sendKeys("kanikaahuja@outlook.com");
		driver.findElement(By.xpath("//*[@id=\"sg_popup_phone_no\"]")).sendKeys("7986378856");
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		String emailErr=driver.findElement(By.xpath("//form[@class='sup_frm signup-new-form']/div[1]/p")).getText();
		System.out.println(emailErr);
		String expected="Successfully Registered";
		Assert.assertEquals(emailErr, expected);
		
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}
