package com.name;

import java.util.Scanner;

public class SwapOfNumber {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in); // new scanner object "obj" is created
		System.out.println("Enter the value of a : ");
		int number1 = obj.nextInt(); // accepts integer values
		System.out.println("Enter the value of b : ");
		int number2 = obj.nextInt();

		System.out.println("Before Swapping the values are, number1 :" + number1 + " and number2 :" + number2);

		int temp = number1;
		number1 = number2;
		number2 = temp;

		System.out.println("After Swapping the values are, number1 :" + number1 + " and number2 :" + number2);

		obj.close();
	}

}
