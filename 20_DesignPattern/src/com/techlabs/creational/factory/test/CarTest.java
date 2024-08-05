package com.techlabs.creational.factory.test;

import com.techlabs.creational.factory.model.CarType;
import com.techlabs.creational.factory.model.ICar;
import com.techlabs.creational.factory.model.ICarFactory;
import com.techlabs.creational.factory.model.MarutiFactory;
import com.techlabs.creational.factory.model.TataFactory;

public class CarTest {

	public static void main(String[] args) {

		ICarFactory marutiFactory = new MarutiFactory();

		ICar maruti = marutiFactory.makeCar();

		maruti.start();
		maruti.stop();

		ICarFactory tataFactory = new TataFactory();

		ICar tata = tataFactory.makeCar();
		tata.start();
		tata.stop();

		ICarFactory mahindraFactory = new MarutiFactory();
		ICar mahindra = mahindraFactory.makeCar();
		mahindra.start();
		mahindra.stop();

	}

}
