package com.iterativestatements;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = obj.nextInt();

		int i = 2;
		int sum = 0;

		while (i < number) {
			if (number % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if (sum == 0) {
			System.out.println("The number is prime");
		} else {
			System.out.println("The number is not prime");
		}

		obj.close();
	}

}
