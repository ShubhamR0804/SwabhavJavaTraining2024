package com.techlabs.exceptions;

public class InsufficientBalanceException extends RuntimeException {
	private double balance;
	
	
	public InsufficientBalanceException(double balance) {
		super();
		this.balance = balance;
	}


	public String getMessage() {
		return "The Account Balance is Insufficient. Current balance is : " +balance;
	}
	

}
