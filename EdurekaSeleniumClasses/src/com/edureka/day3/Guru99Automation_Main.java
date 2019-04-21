package com.edureka.day3;

public class Guru99Automation_Main {

	public static void main(String[] args) {
	
		Guru99Automation guru=new Guru99Automation();
		guru.invokeBrowser();
		guru.login();
		guru.addCustomer();
		guru.closeBrowser();
	}

}
