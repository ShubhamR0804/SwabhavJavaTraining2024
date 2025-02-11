package com.techlabs.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int accountNumber;
	private String name;
	private double balance;
	private List<INotifier> notifiers;

	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.notifiers = new ArrayList<>();
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

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

	public List<INotifier> getNotifiers() {
		return notifiers;
	}

	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}

	public void deposit(double amount) {
		this.balance += amount;
		notifyAllNotifiers();
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (this.balance < amount) {
			throw new InsufficientFundsException("Insufficient funds for withdrawal.");
		}
		this.balance -= amount;
		notifyAllNotifiers();
	}

	public void registerNotifier(INotifier notifier) {
		this.notifiers.add(notifier);
	}

	private void notifyAllNotifiers() {
		for (INotifier notifier : notifiers) {
			notifier.notify(this);
		}
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", notifiers="
				+ notifiers + "]";
		
		
	}
	
	
}