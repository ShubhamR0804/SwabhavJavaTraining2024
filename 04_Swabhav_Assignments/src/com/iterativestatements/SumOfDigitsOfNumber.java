package com.iterativestatements;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = obj.nextInt();
		int sum = 0;
		int rem;

		while (number > 0) {
			rem = number % 10;
			sum = sum + rem;
			number = number / 10;
		}

		System.out.println("Sum is " + sum);
		
		obj.close();

	}

}
