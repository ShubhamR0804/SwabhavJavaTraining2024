package com.assignments;

import java.util.Scanner;

public class CompoundInterestCalculator {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("To Calculate Compound Interest");
		System.out.println("The Principal Amount is :");
		int principal_amount = obj.nextInt();
		System.out.println("The Time period is :");
		int time = obj.nextInt();
		System.out.println("The Rate of Interest is :");
		double rate_of_interest = obj.nextDouble();
		System.out.println("Number of times compound is to be done is :");
		int number_of_times = obj.nextInt();

		double compound_interest = principal_amount * (Math.pow((1 + (rate_of_interest / number_of_times)), (number_of_times * time))) - principal_amount ;

		System.out.println("The Compound Interest is :" + compound_interest);

		obj.close();
	}
}
