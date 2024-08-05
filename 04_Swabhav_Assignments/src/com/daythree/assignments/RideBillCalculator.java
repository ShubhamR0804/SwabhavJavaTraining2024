package com.daythree.assignments;

import java.util.Scanner;

public class RideBillCalculator {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the height in cm : ");
		int height = obj.nextInt();
		System.out.println("Enter the age : ");
		int age = obj.nextInt();
		System.out.println("Want Photos? type true/false ");
		boolean photos = obj.nextBoolean();
		int ride_charge = 0;

		if (height > 120) {
			System.out.println("Can Ride");
			if (age < 12) {
				ride_charge = 5;
			}
			else if(age>= 12 && age<18) {
				ride_charge = 7;
			}
			else if(age>=18 && age<=45) {
				ride_charge = 12;
			}
			else if(age>=45 && age<=55) {
				ride_charge = 0;
			}
			else if(age > 55) {
				ride_charge = 12;		
			}
			if(photos == true) {
				int total_charge = ride_charge + 3;
				System.out.println("The total bill is:" +total_charge);
			}
			else {
				System.out.println("The total bill is: " +ride_charge);
			}
		} else {
			System.out.println("Can't Ride");
		}
		obj.close();
	}

}
