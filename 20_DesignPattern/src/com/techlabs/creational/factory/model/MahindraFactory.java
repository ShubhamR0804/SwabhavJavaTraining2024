package com.techlabs.creational.factory.model;

public class MahindraFactory implements ICarFactory {

	@Override
	public ICar makeCar() {
		// TODO Auto-generated method stub
		return new Mahindra();
	}

}
