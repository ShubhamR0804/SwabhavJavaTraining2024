package com.iterativestatements;

import java.util.Scanner;

public class ArmstrongNumberFinder {
	
	public static void main(String[] args) {
		
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter the number to check if it is Armstrong Number of Not : ");
		int number = obj.nextInt();
		int sum = 0;
		int rem;
		int temp = number;
		
		while(number>0) {
			
			rem = number % 10;
			rem = rem*rem*rem;
			sum = sum + rem;
			number = number/10;
		}
		if(sum==temp) {
			System.out.println("Yes the number is Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
		
		obj.close();
		
	}

}
