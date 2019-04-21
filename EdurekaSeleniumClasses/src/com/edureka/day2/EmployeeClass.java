package com.edureka.day2;

public class EmployeeClass {
	int salary;
	int bonus;
	
	//-----method with return type void------------
	void calculateSalary()
	{
		int totalSalary;
		totalSalary=salary+bonus;
		System.out.println("Total Salary is:" +totalSalary);
	}
	
	//--------method with return type-----------
	
	int calculateSalary1()
	{
		int totalSalary;
		totalSalary=salary+bonus;
		return totalSalary;
	}

	//------method with arguments-----------------
	
	int calculatesSalary2(int sal, int bon)
	{
		int totalSalary;
		totalSalary=sal+bon;
		return totalSalary;
    }
	
	//-------methods with arguments and of same name as of class variables----
	
	int calculatesSalary3(int salary, int bonus)
	{
		int totalSalary;
		totalSalary= salary+bonus;
		return totalSalary;
	}
	
	//----- method to show access class variables or instance level variables---
	//----------use this keyword----------------------------
	int calculatesSalary4(int salary, int bonus)
	{
		int totalSalary;
		totalSalary= this.salary+this.bonus;
		return totalSalary;
	}
	//
}
