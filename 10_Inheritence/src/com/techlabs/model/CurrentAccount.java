package com.techlabs.model;

public class CurrentAccount extends Account{
	
	private int overDraftLimit;
	

	public CurrentAccount(String name, double balance, int accountNumber, int overDraftLimit) {
		super(name, balance, accountNumber);
		this.overDraftLimit = overDraftLimit;
	}
	public int getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(int overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	@Override
	public String toString() {
		return "CurrentAccount [overDraftLimit=" + overDraftLimit + ", getAccountNumber()=" + getAccountNumber()
				+ ", getBalance()=" + getBalance() + "]";
	}
	
	
	
}
