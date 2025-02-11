package com.techlabs.creational.abstractfactory.model;

public interface IAccount {
	void credit(double amount);
    void debit(double amount);
    double getBalance();
}
