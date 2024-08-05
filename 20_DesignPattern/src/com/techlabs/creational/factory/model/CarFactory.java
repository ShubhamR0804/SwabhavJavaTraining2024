package com.techlabs.creational.factory.model;

public class CarFactory {
	
	public ICar makeCar(CarType carName) {
		ICar car = null;
		if(carName == CarType.MARUTI)
			car = new Maruti();
		if(carName == CarType.TATA)
			car = new Tata();
		if(carName == CarType.MAHINDRA)
			car = new Mahindra();
		
		return car;
	}

}
