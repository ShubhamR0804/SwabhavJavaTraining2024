package com.trial.model;
import com.trial.enumerator.AccountType;
import com.trial.exception.InsufficientBalanceException;
import com.trial.exception.OverDraftLimitExceededException;
public class Account {

	private String name;
	private double balance;
	private double overDraftLimit;
	private double minimumBalance;
	private AccountType accountType;
	
	public Account(String name, double balance, double overDraftLimit, double minimumBalance, AccountType accountType) {
		this.name = name;
		this.balance = balance;
		this.overDraftLimit = overDraftLimit;
		this.minimumBalance = minimumBalance;
		this.accountType = accountType;
	}

	public void checkOverDraftLimit(double amount) {
		if (balance - amount < -overDraftLimit) {
			throw new OverDraftLimitExceededException("Overdraft limit exceeded.");
		}
	}

	public void checkMinimumBalance() {
		if (balance < minimumBalance) {
			throw new InsufficientBalanceException("Minimum balance must be maintained.");
		}
	}

	public void credit(double amount) {
		balance += amount;
	}

	public void debit(double amount) {
		// Allow overdraft up to a certain limit
		checkOverDraftLimit(amount);
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
