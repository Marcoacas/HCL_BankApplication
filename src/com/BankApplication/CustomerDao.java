package com.BankApplication;

import java.util.List;
import java.util.Scanner;

public class CustomerDao {

	private List<Customer> costumerList;
	
	//Methods
	//Add Costumer
	//Delete Costumer
	//Modify Costumer
	
	public static void addCustomer() {
		Scanner read=new Scanner(System.in);
		System.out.println("Write the client큦 name");
		String name = read.next();
		System.out.println("Write the client큦 Id");
		String custId = read.next();
		System.out.println("Write the client큦 phone number");
		int mobileNo = read.nextInt();
		System.out.println("Write the client큦 e-mail");
		String eMailId = read.next();
		
		new Customer(name, custId, mobileNo, eMailId);
	}
	
	public static void deleteCustomer() {
		
		
	}

	public static void modifyCustomer() {
	
}
}
