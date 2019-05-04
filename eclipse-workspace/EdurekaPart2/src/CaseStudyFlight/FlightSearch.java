package CaseStudyFlight;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


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
	}
	public void bookAFlight()
	{
	driver.findElement(By.xpath("//label[text()='One Way']")).click();
	}
	
	public void enterSource()
	{
	WebElement source=driver.findElement(By.xpath("//input[@name='or-src']"));
	source.sendKeys("Bengaluru");
	source.sendKeys(Keys.ENTER);
	}
	
	public void enterDestination()
	{
	WebElement destination=driver.findElement(By.xpath("//input[@name='or-dest']"));
	destination.sendKeys("Lucknow");
	destination.sendKeys(Keys.ENTER);
	}
	
	public void selectDate()
	{
	driver.findElement(By.xpath("(//input[@name='or-depart'])[1]")).click();
	Actions a=new Actions(driver);
	WebElement cal=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[@class=' ui-datepicker-week-end selected-date ui-datepicker-current-day']"));
	a.moveToElement(cal).click().build().perform();
	}
	
	public void selectpassenger()
	{
	driver.findElement(By.name("passenger")).click();
	Actions a1=new Actions(driver);
	WebElement adult=driver.findElement(By.xpath("//div[@class='passenger-dropdown pax-selection-row']/ul/li[1]/div/button[2]"));
	a1.moveToElement(adult).click().build().perform();
	a1.moveToElement(adult).click().build().perform();
    
	
	WebElement children=driver.findElement(By.xpath("//div[@class='passenger-dropdown pax-selection-row']/ul/li[2]/div/button[2]"));
	a1.moveToElement(children).click().build().perform();
	a1.moveToElement(children).click().build().perform();
	
	WebElement donebutton=driver.findElement(By.xpath("(//div[@class='modal-footer']/button)[1]"));
	waitTillElementClickable(60, By.xpath("(//div[@class='modal-footer']/button)[1]"));
	 a1.moveToElement(donebutton).build().perform();
	 donebutton.click();
	//driver.findElement(By.xpath("//div[@class='modal-footer']/button[contains(text(),'Done')]")).click();
	}
	
	//driver.findElement(By.xpath("//div[@class='passenger-dropdown pax-selection-row']//button[text()='Done']")).click();



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


	public void submitForm()
	{
	driver.findElement(By.xpath("//button[@type='submit']/span[text()='Search Flight']")).click();
	}
	
	/*public void getList()
	{
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	List<WebElement> allFlights=driver.findElements(By.xpath("//div[@class='row trips-row d-none d-flex']/div/div/div/div/div"));
	for(WebElement flights:allFlights)
	{
		System.out.println(flights.getText());
		System.out.println("--------------------------------------");
	}
	
	}
	
	public void closeBrowser()
	{
	driver.quit();
	}*/
}
