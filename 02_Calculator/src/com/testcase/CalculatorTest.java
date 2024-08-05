package com.testcase;

import com.aurionpro.calci.Maths;
import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		/*
		 * int a = 20; int b = 10;
		 */
		Scanner obj = new Scanner(System.in); // new scanner object "obj" is created
		System.out.println("Enter the value of a : ");
		int a = obj.nextInt(); // accepts integer values
		System.out.println("Enter the value of b : ");
		int b = obj.nextInt();

		// called from aurionpro.calci package
		Maths.add(a, b);
		Maths.sub(a, b);
		Maths.mul(a, b);
		Maths.div(a, b);

		// scanner obj closed to avoid resource leaks
		obj.close();

	}

}
