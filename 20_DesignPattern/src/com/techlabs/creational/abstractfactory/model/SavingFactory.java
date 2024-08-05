package com.techlabs.creational.abstractfactory.model;

public class SavingFactory implements AccountFactory {

	@Override
	public IAccount makeAccount(String accountHolder, long accountNumber, double balance, double interestRate) {
		return new SavingAccount(accountHolder, accountNumber, balance, interestRate);
	}
}
