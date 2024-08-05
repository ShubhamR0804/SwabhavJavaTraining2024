package com.commandline;

import java.util.Scanner;

public class Swapper2CommandLine {
	public static void main(String[] args) {

		int number1 = Integer.parseInt(args[0]);
		System.out.println("Enter the value of 1 : " + number1);
		int number2 = Integer.parseInt(args[1]);
		System.out.println("Enter the value of 2 : " + number2);

		System.out.println("Before Swapping the values are, number1 :" + number1 + " and number2 :" + number2);

		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;

		System.out.println("After Swapping the values are, number1 :" + number1 + " and number2 :" + number2);

	}
}
