package com.edureka.day2;

public class EmployeeClass_Main {

	public static void main(String[] args) {
		//----- object for method with return type void------------
		EmployeeClass kanika=new EmployeeClass(); //declaring and instantiation(with new keyword)
		                                            //and initialization(creating a constructor and defining default values to vaiables
		kanika.salary=33000;
		kanika.bonus=10000;
		kanika.calculateSalary();
		
		//-----object for method with return type void------------
		EmployeeClass gaurav=new EmployeeClass();
		gaurav.salary=20000;
		gaurav.bonus=5000;
		gaurav.calculateSalary();
        
		//--------object for methods with return type-----------
       	EmployeeClass akshay=new EmployeeClass();
		akshay.salary=10000;
		akshay.bonus=5000;
		int askhaySalary=akshay.calculateSalary1();
		System.out.println("Akshay Total Salary:"+askhaySalary);
		
		//------object for methods with arguments---------------
		EmployeeClass mohan=new EmployeeClass();
		int mohanSalary=mohan.calculatesSalary2(45000, 5000);
		System.out.println("Mohan's Salary:"+mohanSalary);
		
		//-------object of methods with arguments and of same name as of class variables---
		//--------how to access argument level variables------------------------------------
		EmployeeClass sohan=new EmployeeClass();
		sohan.salary=200;
		sohan.bonus=20;
		int sohanSalary=sohan.calculatesSalary3(80000, 2000);
		System.out.println("Sohan Salary:"+sohanSalary);
		
		//-------object for method to show access class variables or instance level variables---
		//----------use this keyword----------------------------
		EmployeeClass sohan1=new EmployeeClass();
		sohan1.salary=200;
		sohan1.bonus=20;
		int sohan1Salary=sohan.calculatesSalary4(80000, 2000);
		System.out.println("Sohan Salary:"+sohan1Salary);
		
	}

}
