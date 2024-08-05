package com.commandline;

import java.util.Scanner;

public class SimpleInterestCalculatorCommandLine {
	
	public static void main(String[] args) {
		
		int principal_amt = Integer.parseInt(args[0]);
		System.out.println("Enter the principal amount : ");
		double interest = Integer.parseInt(args[1]);
		System.out.println("Enter the rate of intrest : ");
		int time = Integer.parseInt(args[2]);
		System.out.println("Enter the time : ");
		

		double simple_interest = (principal_amt * interest * time) / 100;

		System.out.println("The Simple Interest of principal amount of " + principal_amt + ", over a period of " + time
				+ "yr with the rate of interest of" + interest + " is :" + simple_interest);

		
	}

}
