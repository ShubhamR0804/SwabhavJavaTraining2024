package com.conditionalstatements;

import java.util.Scanner;

public class MaxAndMinOfTwoNumbers {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter first number :");
		int first_number = obj.nextInt();
		System.out.println("Enter second number");
		int second_number = obj.nextInt();
		
		if (first_number == second_number) {
			System.out.println("The numbers are equal");
		}
		else if (first_number > second_number) {
			System.out.println("The First number is greater");
		}
		else {
			System.out.println("The second number is greater");
		}
		
		obj.close();

}
}
