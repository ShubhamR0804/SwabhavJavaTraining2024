package com.conditionalstatements;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter a number :");
		int number = obj.nextInt();

		if (number % 2 == 0) {
			System.out.println("The entered number is Even");
		} else {
			System.out.println("The entered number is odd");
		}
		
		obj.close();
	}

}
