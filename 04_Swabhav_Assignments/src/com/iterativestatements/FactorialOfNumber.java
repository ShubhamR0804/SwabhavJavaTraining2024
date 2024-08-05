package com.iterativestatements;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = obj.nextInt();
		int i;
		int factorial = 1;
		for(i=1;i<=number;i++) {
			factorial = factorial*i;
			
		}
		System.out.println("The Factorial is : " +factorial);
		obj.close();
	}

}
