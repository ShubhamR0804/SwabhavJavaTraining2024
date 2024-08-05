package com.iterativestatements;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("The Number is : ");
		int number = obj.nextInt();
		int rev = 0;
		int rem;
		int temp = number;
		
		while (number > 0) {
			rem = number % 10;
			rev = (rev*10)+rem;
			number = number / 10;
		}
		
		if(temp == rev) {
			System.out.println("The Number is Palindrome");
		}
		else {
			System.out.println("It is NOT");
		}
		obj.close();
	}

}
