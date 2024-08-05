package com.iterativestatements;

import java.util.Scanner;

public class ArmstrongNumberWithVariableLength {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number to check 4 or 5 digit number : ");
		int number = obj.nextInt();
		int sum = 0;
		int rem;
		int power = 0;
		int temp = number;
		
		while(number > 0 ) {
			power++;
			number = number/10;
			
		}
		number = temp;
		
		while (number>0) {
			rem = number % 10;
			sum = sum + (int)(Math.pow(rem, power));
			number = number/10;
		}
		number=temp;
		
		if(sum==number) {
			System.out.println("The number is armstrong");
		} else {
			System.out.println("NOT");
		}
		
		obj.close();
		
	}

}
