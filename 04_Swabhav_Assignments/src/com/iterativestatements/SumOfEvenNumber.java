package com.iterativestatements;

import java.util.Scanner;

public class SumOfEvenNumber {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number to stop at : ");
		int stop_number = obj.nextInt();
		int sum = 0;
		int i = 1;
		
		while(i<=stop_number) {
			
			if (i%2 == 0) {
				sum = sum + i;
				i++;
			}
			
		}
		System.out.println("The sum of even number is : " +sum);
		
		obj.close();
	}

}
