package com.daysevenassignment.model;

public class BankAccount {
	
	private  long accountNumber;
	private  String name;
	private  double balance;
	private  double withdraw;
	private  double deposit;
	
	
	public BankAccount(String name, double balance, long accountNumber, double withdraw, double deposit) {
		
		this.name = name;
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.withdraw = withdraw;
		this.deposit = deposit;
		
	}
	
	
	public BankAccount() {
		
	}


	public long getAccountNumber() {
		return accountNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getDeposit() {
		return deposit;
	}
	
	public double getWithdraw() {
		return withdraw;
	}
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	
	
	

}
