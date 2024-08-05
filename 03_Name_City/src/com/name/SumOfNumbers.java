package com.name;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in); // new scanner object "obj" is created
		System.out.println("Enter the value of a : ");
		int number1 = obj.nextInt(); // accepts integer values
		System.out.println("Enter the value of b : ");
		int number2 = obj.nextInt();

		int add = number1 + number2;

		System.out.println("Addition of number1:" + number1 + " and number2:" + number2 + " is :" + add);

		obj.close();

	}

}
