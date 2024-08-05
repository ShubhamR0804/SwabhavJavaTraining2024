package com.techlabs.model;

public class SavingsAccount extends Account {
	
	private double minBalance;

	
	public SavingsAccount(String name, double balance, int accountNumber, double minBalance) {
		super(name, balance, accountNumber);
		this.minBalance = minBalance;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	@Override
	public String toString() {
		return "SavingsAccount [minBalance=" + minBalance + ", getAccountNumber()=" + getAccountNumber()
				+ ", getBalance()=" + getBalance() + "]";
	}
	
	

}
