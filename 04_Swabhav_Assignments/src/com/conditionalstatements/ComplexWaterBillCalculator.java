package com.conditionalstatements;

import java.util.Scanner;

public class ComplexWaterBillCalculator {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the Number of units consumed : ");
		int units_consumed = obj.nextInt();
		int meter_charge = 75;
		int charge = 0;

		if (units_consumed <= 100) {
			charge = units_consumed * 5;
		} else {
			if (units_consumed <= 250) {
				units_consumed -= 100;
				charge = 500 + (units_consumed * 10);
			} else {

				units_consumed -= 250;
				charge = 2000 + (units_consumed * 20);
			}
		}

		int total_water_bill = charge + meter_charge;

		System.out.println("The Total Charge is :" + charge);
		System.out.println("The Total Water Bill is :" + total_water_bill);
		
		obj.close();

	}

}
