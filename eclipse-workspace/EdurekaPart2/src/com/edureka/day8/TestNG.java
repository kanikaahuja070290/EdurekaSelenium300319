package com.edureka.day8;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG {
	
	@Test(priority=0)
	public void createUser()
	{
		Reporter.log("User Created Successfully",true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods= {"deleteUser"})
	public void editUser()
	{
		Reporter.log("Edit user successfully",true);
	}
	
	@Test(dependsOnMethods= {"createUser"})
	public void deleteUser()
	{
		Reporter.log("Delete User Successfully",true);
	}
}
