package com.BankApplication;

import java.util.List;

public class Customer {

	private String name;
	private String customerId;
	private int mobileNo;
	private String emailId;
	private List<Account> accountList;
	private List<Transaction> trasactiontList;
	
	
	
	public Customer(String name, String customerId, int mobileNo, String emailId) {
		super();
		this.name = name;
		this.customerId = customerId;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		
	}
	//Getters & Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public List<Account> getAccountList() {
		return accountList;
	}
	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
	public List<Transaction> getTrasactiontList() {
		return trasactiontList;
	}
	public void setTrasactiontList(List<Transaction> trasactiontList) {
		this.trasactiontList = trasactiontList;
	}
	
	
	
}
