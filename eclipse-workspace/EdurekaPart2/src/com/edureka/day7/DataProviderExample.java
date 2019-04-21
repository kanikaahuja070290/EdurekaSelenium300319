package com.edureka.day7;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
		@Test(dataProvider="getData")
		public void printTestData(String username,String password)
		{
			System.out.println("username:"+username+  "Password:"+password);
		}

		
		@DataProvider
		public String[][] getData()
		{
			String[][] data=new String[3][2];
			data[0][0]="kanika";
			data[0][1]="abc";
			
			data[1][0]="Ashish";
			data[1][1]="def";
			
			data[2][0]="use";
			data[2][1]="123";
			
			return data;
			
		}
	}


