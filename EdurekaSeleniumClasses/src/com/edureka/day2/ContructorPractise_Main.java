package com.edureka.day2;

public class ContructorPractise_Main {

	public static void main(String[] args) {
		ConstructorPractise kanika=new ConstructorPractise();
		kanika.calculateSalary();
		ConstructorPractise ashish=new ConstructorPractise(1000,3000);
		ashish.calculateSalary();
		ConstructorPractise megha=new ConstructorPractise(5000,2000);
		megha.calculateSalary();
	}

}
