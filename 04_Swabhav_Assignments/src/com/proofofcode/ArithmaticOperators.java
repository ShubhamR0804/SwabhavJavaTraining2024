package com.proofofcode;

import java.util.Scanner;

public class ArithmaticOperators {

	public static void main(String[] args) {

		System.out.println(" Arithmatic Operations ");

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = obj.nextInt();
		System.out.println("Enter the value of b:");
		int b = obj.nextInt();

		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		float div = a / b;
		int mod = a % b;

		System.out.println("Addition operator '+'");
		System.out.println("Addition of " + a + " + " + b + " is :" + add);

		System.out.println("Subtraction operator '-'");
		System.out.println("Subtraction of " + a + " - " + b + " is :" + sub);

		System.out.println("Multiplication operator '*'");
		System.out.println("Multiplication of " + a + " * " + b + " is :" + mul);

		System.out.println("Division operator '/'");
		System.out.println("Division of " + a + " / " + b + " is :" + div);

		System.out.println("Modulus operator '%'");
		System.out.println("Modulus of " + a + " % " + b + " is :" + mod);

		obj.close();

	}

}
