package com.techlabs.test;

import com.techlabs.model.BankTransferPayment;
import com.techlabs.model.CreditCardPayment;
import com.techlabs.model.PayPalPayment;
import com.techlabs.model.Payment;

public class PaymentTest {
	
	public static void main(String[] args) {
		
		Payment payment;
		payment = new CreditCardPayment();
		System.out.println("\nThe Following is Credit Card :");
		payment.payBill();
		payment.redeem();
		
		payment = new PayPalPayment();
		System.out.println("\nThe Following is PayPal :");
		payment.payBill();
		payment.redeem();
		
		payment= new BankTransferPayment();
		System.out.println("\nThe Following is Bank Transfer :");
		payment.payBill();
		payment.redeem();
	}
}

