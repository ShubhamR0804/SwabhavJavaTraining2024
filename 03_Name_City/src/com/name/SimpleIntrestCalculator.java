package com.name;

import java.util.Scanner;

public class SimpleIntrestCalculator {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in); // new scanner object "obj" is created
		System.out.println("Enter the principal amount : ");
		int principal_amt = obj.nextInt(); // accepts integer values
		System.out.println("Enter the rate of intrest : ");
		double interest = obj.nextFloat();
		System.out.println("Enter the time : ");
		int time = obj.nextInt();

		double simple_interest = (principal_amt * interest * time) / 100;

		System.out.println("The Simple Interest of principal amount of " + principal_amt + ", over a period of " + time
				+ "yr with the rate of interest of" + interest + " is :" + simple_interest);

		obj.close();
	}

}
