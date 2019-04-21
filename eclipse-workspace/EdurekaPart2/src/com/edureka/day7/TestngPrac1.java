package com.edureka.day7;

import org.testng.annotations.Test;

public class TestngPrac1 {
	
	@Test(priority=1000,groups="Sanity")
	public void testcase1()
	{
		System.out.println("Testcase 1");
	}
	
	@Test(priority=-1)                      //highest priority
	public void testcase2()
	{
		System.out.println("Testcase 2");
	}
	
	@Test(priority=3000,groups="Sanity")
	public void testcase3()
	{
		System.out.println("Testcase 3");
	}
	
	@Test(priority=4000, enabled=false)
	public void testcase4()
	{
		System.out.println("Testcase 4");
	}
	
	
	

}
