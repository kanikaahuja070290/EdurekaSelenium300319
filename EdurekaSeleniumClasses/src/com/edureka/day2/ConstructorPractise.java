package com.edureka.day2;

public class ConstructorPractise {
	int salary;
	int bonus;
	
	ConstructorPractise()
	{
		salary=1000;
		bonus=100;
	}
	
	ConstructorPractise(int salary, int bonus)
	{
		this.salary=salary;
		this.bonus=bonus;
	}
	
	void calculateSalary()
	{
		int totalSalary;
		totalSalary=salary+bonus;
		System.out.println("Total Salary:"+totalSalary);
	}
	
}
