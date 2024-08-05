package com.conditionalstatements;

import java.util.Scanner;

public class PositiveOrNegetive {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int number = obj.nextInt();
		
		if (number>0) {
			System.out.println("The number is positive");
		}
		else if (number<0) {
			System.out.println("The number is negetive");
		}
		else {
			System.out.println("The number entered is 0");
		}
		obj.close();
	}

}
