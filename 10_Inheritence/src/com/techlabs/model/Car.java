package com.techlabs.model;

public class Car extends FourWheeler{
	
	private double price;

	
	public Car(int mileage, String companyName, double price) {
		super(mileage, companyName);
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [price = " + price + ", Mileage = " + getMileage() + ", Company Name = " + getCompanyName()
				+ "]";
	}
	

}
