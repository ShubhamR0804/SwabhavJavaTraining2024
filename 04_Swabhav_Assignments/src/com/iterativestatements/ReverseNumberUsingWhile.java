package com.iterativestatements;

import java.util.Scanner;

public class ReverseNumberUsingWhile {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = obj.nextInt();
		
		while(number>=1) {
			
			System.out.println(number);
			number--;
		}
		
		obj.close();
	}
	
}
