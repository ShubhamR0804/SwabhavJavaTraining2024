package com.techlabs.list.test;

import com.techlabs.list.model.Car;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Car> cars = new ArrayList<Car>();

		readCar(cars, scanner);
	}

	private static void readCar(List<Car> cars, Scanner scanner) {
		System.out.println("Enter the Number of cars :");
		int numberOfCars = scanner.nextInt();
		for (int i = 0; i < numberOfCars; i++) {
			System.out.println("Car Number " +(i+1));
			System.out.println("The car Id is : ");
			int carId = scanner.nextInt();
			System.out.println("The Company Name is : ");
			String companyName = scanner.next();
			System.out.println("The price is : ");
			double price = scanner.nextDouble();
			System.out.println("The Mileage is : ");
			int mileage = scanner.nextInt();
			cars.add(new Car(carId, companyName, price, mileage));
		}

	
	Car maxMileageCar = null;
    double maxMileage = Double.MIN_VALUE;
    for (Car car : cars) {
        if (car.getMileage() > maxMileage) {
        	maxMileage = car.getMileage();
        	maxMileageCar = car;
        }
    }
    
    // Display the car with the maximum price
    if (maxMileageCar == null) {
    	System.out.println("No cars found.");
        return;
    } 
    System.out.println("Car with maximum mileage:");
    System.out.println("Car ID: " + maxMileageCar.getCarId());
    System.out.println("Company Name: " + maxMileageCar.getCompanyName());
    System.out.println("Price: $" + maxMileageCar.getPrice());
    System.out.println("Mileage: " + maxMileageCar.getMileage() + " mpg");    
    
    scanner.close();

}
}