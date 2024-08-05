package com.techlabs.srp.solution.test;

import com.techlabs.srp.solution.model.Printable;
import com.techlabs.srp.solution.model.TaxCalculator;
import com.techlabs.srp.solution.model.Invoice;

public class InvoiceTest {
public static void main(String[] args) {
	Invoice invoice = new Invoice(1, 15000,10, "Mobile Phone");
	
	TaxCalculator taxCalculate = new TaxCalculator(invoice);
	Printable print = new Printable(invoice, taxCalculate);
	
	print.print();
}
}
