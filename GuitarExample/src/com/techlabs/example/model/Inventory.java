package com.techlabs.example.model;

import java.util.LinkedList;
import java.util.List;
import com.techlabs.example.model.Guitar; 

public class Inventory {
	private List guitars;

	public Inventory() {
		guitars = new LinkedList();
	}
	
	public void addGuitar(int serialNumber, double price, String builder, String model, String type, String backWood,
			String topWood) {
		Guitar guitar = new Guitar( serialNumber,  price,  builder,  model,  type,  backWood, topWood);
		guitars.add(guitar);
	}
	
	

}
