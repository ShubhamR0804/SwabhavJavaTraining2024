package com.techlabs.model;

public class PayPalPayment extends Payment{
	
	

	
	@Override
	public void payBill() {
		System.out.println("The Payment was done through PayPal");

		
	}

	@Override
	public void redeem() {
		System.out.println("The redeem was done through PayPal");
	}
	

}
