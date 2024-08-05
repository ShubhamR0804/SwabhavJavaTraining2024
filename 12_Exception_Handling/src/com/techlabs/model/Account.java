package com.techlabs.model;

//import java.util.Random;

import com.techlabs.exceptions.InsufficientBalanceException;

public class Account {

	//private long accountNumber;
	private String name;
	private double balance;
	private double overDraftLimit;
	
	public Account(String name, double balance, double overDraftLimit) {
		//this.accountNumber = this.randomAccountNumber();
		this.name = name;
		this.balance = balance;
		this.overDraftLimit = overDraftLimit;
	}
	/*
	private long randomAccountNumber() {
		long accountNumberCopy = 0;
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			accountNumberCopy += random.nextInt(10);
			if (i != 9)
				accountNumberCopy *= 10;
		}
		return accountNumberCopy;
	}
	*/
	 public boolean checkOverDraftLimit(double amount) {
		 if(this.getBalance() - amount > 15000){
			 //System.out.println(this.getBalance());
			 return true;
		 }
		 else {
			 System.out.println(this.getBalance() - 15000);
			 return false;
		 }
	 }
	 
	 public void credit(double amount) { 
		  if(amount > 0) { 
		   this.balance += amount; 
		   return; 
		  } 
		  System.out.println("Amount can't be negative"); 
		 } 
		 
		 public void debit(double amount) { 
		  if(amount < 0) { 
		   System.out.println("Amount can't be negative"); 
		   return; 
		  } 
		  if(this.balance >= amount) { 
		   this.balance = balance - amount; 
		   return; 
		  } 
		  throw new InsufficientBalanceException(this.getBalance()); 
		 } 
	
	// if(balance<debitAmount) throw new InsufficientBalanceException(balance);
	// this.balance = balance;

	
	 public double getOverDraftLimit() {
			return overDraftLimit;
		}

		public void setOverDraftLimit(double overDraftLimit) {
			this.overDraftLimit = overDraftLimit;
		}

	//public long getAccountNumber() { 
		//  return accountNumber; 
		 // } 
		 
		// public void setAccountNumber(long accountNumber) { 
		 // this.accountNumber = accountNumber; 
		// } 
		 
		 public String getName() { 
		  return name; 
		 } 
		 
		 public void setName(String name) { 
		  this.name = name; 
		 } 
		 
		 public double getBalance() { 
		  return balance; 
		 } 
		 
		 public void setBalance(double balance) { 
		  this.balance = balance; 
		 } 
		 
		 @Override 
		 public String toString() { 
		  return "Account [ name=" + name + ", balance=" + balance + "]"; 
		 }  



}
