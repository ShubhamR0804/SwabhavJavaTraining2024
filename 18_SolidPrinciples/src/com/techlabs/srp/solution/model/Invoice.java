package com.techlabs.srp.solution.model;

public class Invoice {
	
	private int id;
	private double amount;
	private double tax;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", amount=" + amount + ", tax=" + tax + ", description=" + description + "]";
	}
	public Invoice(int id, double amount, double tax, String description) {
		super();
		this.id = id;
		this.amount = amount;
		this.tax = tax;
		this.description = description;
	}
	
	
	
	
	

}
