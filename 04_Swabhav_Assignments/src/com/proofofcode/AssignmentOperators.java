package com.proofofcode;

import java.util.Scanner;

public class AssignmentOperators {

	public static void main(String[] args) {

		System.out.println(" Assignment Operations ");

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = obj.nextInt();
		System.out.println("Enter the value of b:");
		int b = obj.nextInt();
		System.out.println("Enter the value of c:");
		int c = obj.nextInt();

		System.out.println("Simple assignment operator '=' ");
		System.out.println("The value assigned by the user to 'a' is = " + a);

		System.out.println("Compound assignment operator '+=' ");
		System.out.println("Value of a:" + a + " has become " + a + " + " + b + " = " + (a += b));
		System.out.println("New Value of a: " + a);

		System.out.println("Compound assignment operator '-=' ");
		System.out.println("Value of a:" + a + " has become " + a + " - " + b + " = " + (a -= b));
		System.out.println("New Value of a: " + a);

		System.out.println("Compound assignment operator '*=' ");
		System.out.println("Value of b:" + b + " has become " + b + " * " + c + " = " + (b *= c));
		System.out.println("New Value of b: " + b);

		System.out.println("Compound assignment operator '/=' ");
		System.out.println("Value of a:" + a + " has become " + a + " / " + b + " = " + (a /= b));
		System.out.println("New Value of a: " + a);

		System.out.println("Compound assignment operator '%=' ");
		System.out.println("Value of b:" + b + " has become " + b + " % " + c + " = " + (b %= c));
		System.out.println("New Value of b: " + b);

		obj.close();

	}

}
