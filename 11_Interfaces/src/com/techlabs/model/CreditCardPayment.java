package com.techlabs.model;

public class CreditCardPayment implements Payment {

	@Override
	public void payBill() {
		System.out.println("The Payment was done through CreditCard");

	}

	@Override
	public void redeem() {
		System.out.println("The redeem was done through CreditCard");

	}

}
