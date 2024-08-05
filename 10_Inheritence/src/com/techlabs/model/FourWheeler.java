package com.techlabs.model;

public class FourWheeler extends Vehicle{
	
	
	private int mileage;
	
	public FourWheeler(int mileage,String companyName) {
		super(companyName);
		this.mileage = mileage;
	}
	
	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	

}
