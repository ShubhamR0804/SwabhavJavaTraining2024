package com.techlabs.model;

public class BankTransferPayment implements Payment {
	

	@Override
	public void payBill() {
		System.out.println("The Payment was done through Bank Transfer");
		
	}

	@Override
	public void redeem() {
		System.out.println("The redeem was done through Bank Transfer");
		
	}

}
