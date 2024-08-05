package com.assignments;

import java.util.Scanner;

public class TrapezoidalArea {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Length of base a :");
		int base_a = obj.nextInt();
		System.out.println("Length of base b :");
		int base_b = obj.nextInt();
		System.out.println("Height of trapezoid :");
		int height_h = obj.nextInt();

		double area_of_trapezoid = ((base_a + base_b) * height_h) / 2;

		System.out.println("The area of trapezoid is :" + area_of_trapezoid);

		obj.close();
	}
}
