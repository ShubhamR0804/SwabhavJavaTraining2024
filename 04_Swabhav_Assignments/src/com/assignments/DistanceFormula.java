package com.assignments;

import java.util.Scanner;

public class DistanceFormula {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the value of X1 :");
		double x1 = obj.nextDouble();
		System.out.println("Enter the value of X2 :");
		double x2 = obj.nextDouble();
		System.out.println("Enter the value of Y1 :");
		double y1 = obj.nextDouble();
		System.out.println("Enter the value of Y2 :");
		double y2 = obj.nextDouble();

		double distance_formula = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("The Distance between coordinates (x1,x2):(" + x1 + "," + x2 + ") and (y1,y2):(" + y1 + ","
				+ y2 + ") is: " + distance_formula);

		obj.close();
	}

}
