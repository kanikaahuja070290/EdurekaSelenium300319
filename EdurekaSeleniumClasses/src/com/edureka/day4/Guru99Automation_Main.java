package com.edureka.day4;

public class Guru99Automation_Main {

	public static void main(String[] args) {
		Guru99Automation guru= new Guru99Automation();
		guru.invokeBrowser();
		guru.login("mngr188825","ybUhErU");
		guru.addCustomer();  //customerid: 73203
		
		String customerID=guru.getCustomerId();
		System.out.println("Customer ID:"+ customerID);
		
		guru.editCustomer(customerID);
		
		guru.newAccount(customerID);
		String cuurentAmount=guru.getCurrentAmount();
		System.out.println("Current Amountt:"+cuurentAmount);
		
		String accountId=guru.getAccountId();
		System.out.println("Account no:" + accountId);
		
		guru.deposit(accountId);
		
		guru.balanceEnquiry(accountId);
		String dbalance=guru.getBalance();
		System.out.println("Balance after Deposit:"+ dbalance);
		
		guru.withdrawal(accountId);
		guru.balanceEnquiry(accountId);
		String wbalance=guru.getBalance();
		System.out.println("Balance after Withdrawl:"+ wbalance);
		//guru.closeBrowser();
	}

}
