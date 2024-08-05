package com.name;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in); // new scanner object "obj" is created
		System.out.println("Enter the radius : ");
		int radius = obj.nextInt(); // accepts integer values

		double area = 3.14 * radius * radius;

		System.out.println("The area of circle is:" + area);

		obj.close();
	}

}
