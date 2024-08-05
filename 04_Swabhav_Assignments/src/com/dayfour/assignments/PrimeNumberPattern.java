package com.dayfour.assignments;

import java.util.Scanner;

public class PrimeNumberPattern {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		PrimeNumberPattern primeNumberPattern = new PrimeNumberPattern();
		System.out.println("Enter Number of lines :");
		int currentPrime = 2;
		int lines = obj.nextInt();
		for (int i = 1; i <= lines; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(currentPrime + "\t");
				currentPrime = primeNumberPattern.nextPrime(currentPrime);
			}
			
			System.out.println();
			obj.close();
		}
	}

	boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	int nextPrime(int currentPrime) {
		int newPrime = currentPrime + 1;

		while (!isPrime(newPrime)) {
			newPrime++;
		}

		return newPrime;
	}

}
