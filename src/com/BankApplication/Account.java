package com.BankApplication;

public abstract class Account  {
	
	private String accountNo;
	private int balance;
	private String coustomer;
	
	
	//Getter & Setters
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getCoustomer() {
		return coustomer;
	}
	public void setCoustomer(String coustomer) {
		this.coustomer = coustomer;
	}
	
	
	
}
