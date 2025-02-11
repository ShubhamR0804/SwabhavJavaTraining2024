package com.techlabs.creational.abstractfactory.model;

public class SavingAccount implements IAccount {

	private String accountHolder;
	private long accountNumber;
	private double balance;
	private double interestRate;

	public SavingAccount(String accountHolder, long accountNumber, double balance, double interestRate) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

	@Override
	public void credit(double amount) {
		balance += amount;
	}

	@Override
	public void debit(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficient funds.");
		}
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "SavingAccount [accountHolder=" + accountHolder + ", accountNumber=" + accountNumber + ", balance="
				+ balance + ", interestRate=" + interestRate + "]";
	}

}
