package com.techlabs.model;

public class Account {
	
	private int accountNumber;
	private double balance;
	private String name;
	
	public Account(String name,double balance,int accountNumber) {
		
		super();
		this.name = name;
		this.balance = balance;
		this.accountNumber = accountNumber;
		
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
