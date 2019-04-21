package com.edureka.day6;

public class MethodOverloading_Main {

	public static void main(String[] args) {
		
		MethodOverloading circle=new MethodOverloading();
		System.out.println(circle.calculateArea(5.5));
		
		MethodOverloading rec=new MethodOverloading();
		System.out.println(rec.calculateArea(5, 6));
		
		MethodOverloading sq=new MethodOverloading();
		System.out.println(sq.calculateArea(5));
		
		

	}

}
