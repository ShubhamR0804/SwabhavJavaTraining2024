package com.conditionalstatements;

import java.util.Scanner;

public class MaxOfThreeNumbers {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter first number :");
		int first_number = obj.nextInt();
		System.out.println("Enter second number");
		int second_number = obj.nextInt();
		System.out.println("Enter third number");
		int third_number = obj.nextInt();
		
		if ((first_number>second_number) && (first_number>third_number)) {
			System.out.println("The First number is Greatest");
		}
		else if ((second_number>third_number) && (second_number>first_number)) {
			System.out.println("The Second number is Greatest");
		}
		else {
			System.out.println("The Third Number is Greatest");
		}
		
		obj.close();

}
}
