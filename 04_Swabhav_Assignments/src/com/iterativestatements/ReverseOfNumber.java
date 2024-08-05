package com.iterativestatements;

import java.util.Scanner;

public class ReverseOfNumber {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = obj.nextInt();
		int rev = 0;
		int rem;
		
		while (number > 0) {
			rem = number % 10;
			rev = (rev*10)+rem;
			number = number / 10;
		}
		System.out.println("The reversed number is : "+rev);
		obj.close();
	}

}
