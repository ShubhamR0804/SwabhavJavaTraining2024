package com.techlabs.srp.violation.test;

import com.techlabs.srp.violation.model.Invoice;

public class InvoiceTest {
	
	public static void main(String[] args) {
		
		Invoice invoice = new Invoice(1, 15000,10, "Mobile Phone");
		
		invoice.getId();
	}

}
