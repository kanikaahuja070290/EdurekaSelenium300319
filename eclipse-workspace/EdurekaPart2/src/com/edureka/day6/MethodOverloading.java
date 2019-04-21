package com.edureka.day6;

public class MethodOverloading {
	
//area of circle
	public double calculateArea(double radius)
	{
		double area;
		area=Math.PI*radius*radius;
		return area;
	}
	
//area of rectangle
	public int calculateArea(int length, int width)
	{
		int area;
		area=length*width;
		return area;
	}
	
// area of square
	public int calculateArea(int side)
	{
		int area;
		area=side*side;
		return area;
	}

}

