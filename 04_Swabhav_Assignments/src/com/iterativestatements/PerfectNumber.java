package com.iterativestatements;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = obj.nextInt();
		int i = 1;
		int sum = 0;
		while(i<number) {
		if( number%i ==0 ) {
			sum += i;
		}i++;
		}
		if(sum == number) {
			System.out.println("The number is perfect number");
		} 
		else 
		{
			System.out.println("It is Not");
		}
		obj.close();
	
	}

}
