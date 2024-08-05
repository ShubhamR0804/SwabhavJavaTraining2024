package com.techlabs.creational.abstractfactory.model;

public class CurrentFactory implements AccountFactory {

	@Override
	public IAccount makeAccount(String accountHolder, long accountNumber, double balance, double overdraftLimit) {
		return new CurrentAccount(accountHolder, accountNumber, balance, overdraftLimit);
	}

}
