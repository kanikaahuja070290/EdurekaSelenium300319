package com.edureka.day7;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample2 {
	@Test(dataProvider="getData")
	public void printTestData(String username,String password, int employeeId)
	{
		System.out.println("username:"+username+  "Password:"+password);
	}

	
	@DataProvider
	public Object[][] getData()
	{
		 Object[][] data=new Object[2][3];
		data[0][0]="kanika";
		data[0][1]="abc";
		data[0][2]=1000;
		
		data[1][0]="Ashish";
		data[1][1]="def";
		data[1][2]=1001;
		
		return data;
		
	}

}
