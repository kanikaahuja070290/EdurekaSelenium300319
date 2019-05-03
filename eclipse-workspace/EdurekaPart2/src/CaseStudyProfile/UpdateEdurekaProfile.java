package CaseStudyProfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateEdurekaProfile {
	
	WebDriver driver;
	
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
	
	public void updateProfile()
	{
		driver.get("https://learning.edureka.co/my-profile");
		
		//click professional edit icon
		WebElement profileEdit=driver.findElement(By.xpath("//a[@id='professional_details']"));
		waitTillElementVisble(60, By.xpath("//a[@id='professional_details']"));
		profileEdit.click();
		
		//update CompanyName
		WebElement companyName=driver.findElement(By.xpath("//input[@name='companyName']"));
		waitTillElementVisble(60, By.xpath("//input[@name='companyName']"));
		//companyName.clear();
		//companyName.sendKeys("abc");
		//companyName.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "Your Value");
		 Actions actionList = new Actions(driver);
	     actionList.clickAndHold(companyName).sendKeys("abc").release().build().perform();
		
		
		//update Most Accurately Describes your Current Job Level ?
		WebElement jobLevelDropdown= driver.findElement(By.xpath("//select[@name='currentjob']"));
		Select currentJob= new Select(jobLevelDropdown);
		currentJob.selectByValue("Top/Executive Management");
		
		//update Industry
		WebElement industryDropdown=driver.findElement(By.xpath("//select[@name='currentIndustry']"));
		Select industry=new Select(industryDropdown);
		industry.selectByValue("Internet");
		
		
		//update Linkedin Profile
		WebElement linkedinProfile=driver.findElement(By.xpath("//input[@name='linkedinLink']"));
		linkedinProfile.clear();
		linkedinProfile.sendKeys("abc");
		
		//update skills
		
		//click next
		
	}
		
	}
	
	


