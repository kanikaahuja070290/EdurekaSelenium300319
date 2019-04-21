package com.edureka.day7;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngAnnotations {
	
	
	@Test
	public void testcase1()
	{
		System.out.println("Test case 1");
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("Test case 2");
	}
	
	@Test(groups="Sanity")
	public void testcase3()
	{
		System.out.println("Test case 3");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod()
	{
		System.out.println("Before a Method");
	}

	@AfterMethod(alwaysRun=true)
	public void afterMethod()
	{
		System.out.println("After a Method");
	}
	
	@BeforeClass
	public void beforeAClass()
	{
		System.out.println("First Method to be Executed before a class loads");
	}
	
	@AfterClass
	public void afterAClass()
	{
		System.out.println("Last Method to be executed in the class");
	}
}
