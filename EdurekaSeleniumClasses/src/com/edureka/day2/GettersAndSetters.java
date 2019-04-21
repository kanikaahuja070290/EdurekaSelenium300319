package com.edureka.day2;

public class GettersAndSetters {
	private int bonus;
	private int salary;
	
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
	
	public int getSalary() {
		return salary;
	}


	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	void calculatesalary()
	{
		int totalSalary;
		totalSalary=bonus+salary;
		System.out.println("Total Salary:"+totalSalary);
	}
	 

}
