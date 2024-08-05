package com.techlabs.decorator.test;

import com.techlabs.decorator.model.CarInspection;
import com.techlabs.decorator.model.ICarService;
import com.techlabs.decorator.model.OilChange;
import com.techlabs.decorator.model.WheelAlign;

public class ClientTest {
	
	 public static void main(String[] args) {
	        ICarService carService = new CarInspection();
	        System.out.println("Base Service Cost: " + carService.getCost());

	        carService = new OilChange(carService);
	        System.out.println("Cost after Oil Change: " + carService.getCost());

	        carService = new WheelAlign(carService);
	        System.out.println("Cost after Wheel Alignment: " + carService.getCost());
	    }

}
