package com.edureka.day4;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class Guru99Automation {
		ChromeDriver driver;
		public void invokeBrowser()
		{
			System.setProperty("webdriver.chrome.driver",
					"\\C:\\Users\\A2M0014\\drivers\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			//driver.manage().window().fullscreen();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://demo.guru99.com/v4/");
		}
		
		public void login(String userId, String userpwd)
		{
			WebElement userIDElement;
			userIDElement=driver.findElement(By.name("uid"));
			userIDElement.sendKeys(userId);
			driver.findElement(By.name("password")).sendKeys(userpwd);
			driver.findElement(By.name("btnLogin")).click();
		}
		
		public void addCustomer()
		{
			
			driver.findElement(By.linkText("New Customer")).click();
			driver.findElement(By.xpath("//input[@name='name']")).sendKeys("kanika");
			driver.findElement(By.xpath("//input[@value='f']")).click();
			driver.findElement(By.name("dob")).sendKeys("10-04-2018");
			driver.findElement(By.name("addr")).sendKeys("Flatno302");
			driver.findElement(By.name("city")).sendKeys("Gurgaon");
			driver.findElement(By.name("state")).sendKeys("Haryana");
			driver.findElement(By.name("pinno")).sendKeys("122016");
			driver.findElement(By.name("telephoneno")).sendKeys("1634511190");
			
			String emailID="qwerty" + System.currentTimeMillis() + "@abc.com"; //unique email id
			driver.findElement(By.name("emailid")).sendKeys(emailID);
			//driver.findElement(By.name("emailid")).sendKeys("kanika1@app2mobile.com");
			driver.findElement(By.name("password")).sendKeys("abc");
			driver.findElement(By.name("sub")).click();
		}
		public String getCustomerId()
		{
			return driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
			
		}
		
		public void editCustomer(String customerID)
		{
			driver.findElement(By.linkText("Edit Customer")).click();
			driver.findElement(By.name("cusid")).sendKeys(customerID);
			driver.findElement(By.name("AccSubmit")).click();
			driver.findElement(By.name("pinno")).clear();
			driver.findElement(By.name("pinno")).sendKeys("111111");
		}
		
		public void newAccount(String customerID)
		{
			driver.findElement(By.linkText("New Account")).click();
			driver.findElement(By.name("cusid")).sendKeys(customerID);
			
			WebElement dropDown=driver.findElement(By.name("selaccount"));
			Select selAccount=new Select (dropDown);
			selAccount.selectByVisibleText("Current");
			
			driver.findElement(By.name("inideposit")).sendKeys("50000");;
			driver.findElement(By.name("button2")).click();
			
		}
		
		public String getCurrentAmount()
		{
			return driver.findElement(By.xpath("//table[@id='account']/tbody/tr/td[text()='Current Amount']//following-sibling::td")).getText();
		}
		
		public String getAccountId()
		{
			return driver.findElement(By.xpath("//table[@id='account']/tbody/tr[4]/td[2]")).getText();
		}
		
		public void deposit(String accountId)
		{
			driver.findElement(By.linkText("Deposit")).click();
			driver.findElement(By.name("accountno")).sendKeys(accountId);
			driver.findElement(By.name("ammount")).sendKeys("10000");
			driver.findElement(By.name("desc")).sendKeys("Deposit Practise");
			driver.findElement(By.name("AccSubmit")).click();
		}
		
		public void withdrawal(String accountId)
		{
			driver.findElement(By.linkText("Withdrawal")).click();
			driver.findElement(By.name("accountno")).sendKeys(accountId);
			driver.findElement(By.name("ammount")).sendKeys("5000");
			driver.findElement(By.name("desc")).sendKeys("Withdrawl Practise");
			driver.findElement(By.name("AccSubmit")).click();
		}
		public void balanceEnquiry(String accountId)
		{
			driver.findElement(By.linkText("Balance Enquiry")).click();
			driver.findElement(By.name("accountno")).sendKeys(accountId);
			driver.findElement(By.name("AccSubmit")).click();
		}
		
		public String getBalance()
		{
			return driver.findElement(By.xpath("//table[@id='balenquiry']/tbody/tr[16]/td[2]")).getText();
		}
		/*public void changePassword()
		{
			driver.findElement(By.name("oldpassword")).sendKeys("abc");
			driver.findElement(By.name("newpassword")).sendKeys("abc1");
			driver.findElement(By.name("confirmpassword")).sendKeys("abc1");
			driver.findElement(By.name("submit")).click();
		}*/
		public void closeBrowser()
		{
			driver.quit();
		}

}
