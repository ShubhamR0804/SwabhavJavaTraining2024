package com.techlabs.creational.abstractfactory.model;

public class CurrentAccount implements IAccount {
	 private String accountHolder;
	    private long accountNumber;
	    private double balance;
	    private double overdraftLimit;

	    public CurrentAccount(String accountHolder, long accountNumber, double balance, double overdraftLimit) {
	        this.accountHolder = accountHolder;
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	        this.overdraftLimit = overdraftLimit;
	    }

	    @Override
	    public void credit(double amount) {
	        balance += amount;
	    }

	    @Override
	    public void debit(double amount) {
	        if (balance + overdraftLimit >= amount) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient funds including overdraft limit.");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }

	    @Override
	    public String toString() {
	        return "CurrentAccount [accountHolder=" + accountHolder + ", accountNumber=" + accountNumber + ", balance=" + balance + ", overdraftLimit=" + overdraftLimit + "]";
	    }

}
