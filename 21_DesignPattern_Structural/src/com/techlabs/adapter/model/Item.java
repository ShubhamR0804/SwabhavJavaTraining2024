package com.techlabs.adapter.model;

public class Item implements CartItem {
    private String name;
    private double price;
    private double tax;

    public Item(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    @Override
    public String getItemName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price + (this.price * this.tax);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
