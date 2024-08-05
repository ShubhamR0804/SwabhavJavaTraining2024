package com.techlabs.example.model;

public class Guitar {

	private int serialNumber;
	private double price;
	private String builder;
	private String model;
	private String type;
	private String backWood;
	private String topWood;
	public Guitar(int serialNumber, double price, String builder, String model, String type, String backWood,
			String topWood) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBuilder() {
		return builder;
	}
	public void setBuilder(String builder) {
		this.builder = builder;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBackWood() {
		return backWood;
	}
	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}
	public String getTopWood() {
		return topWood;
	}
	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}
	@Override
	public String toString() {
		return "Guitar [serialNumber=" + serialNumber + ", price=" + price + ", builder=" + builder + ", model=" + model
				+ ", type=" + type + ", backWood=" + backWood + ", topWood=" + topWood + "]";
	}
	
}
