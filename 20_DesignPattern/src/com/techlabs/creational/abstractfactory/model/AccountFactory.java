package com.techlabs.creational.abstractfactory.model;

public interface AccountFactory {

	IAccount makeAccount(String accountHolder, long accountNumber, double balance, double additionalInfo);

}
