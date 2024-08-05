package com.iterativestatements;

import java.util.Scanner;

public class SumOfFirstHundredNaturalNumber {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number to stop counting at : ");
		int stop_number = obj.nextInt();
		int i = 1;
		int sum = 0;
		
		while( i <= stop_number ) {
			
			sum = sum + i;
			i++;
			
			
		}
		System.out.println("The sum is" +sum);
		
		obj.close();
		
		
	}

}
