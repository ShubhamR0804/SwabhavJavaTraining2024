package com.proofofcode;

import java.util.Scanner;

public class ComparisonOperator {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the value of a:");
		int a = obj.nextInt();
		System.out.println("Enter the value of b:");
		int b = obj.nextInt();

		if (a == b) {
			System.out.println("a is equal to b");
		} else {
			System.out.println("a is not equal to b");
		}

		if (a != b) {
			System.out.println("a is not equal to b");
		} else {
			System.out.println("a is equal to b");
		}

		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("a is not greater than b");
		}

		if (a >= b) {
			System.out.println("a is greater than or equal to b");
		} else {
			System.out.println("a is not greater than or equal to b");
		}

		if (a < b) {
			System.out.println("a is less than b");
		} else {
			System.out.println("a is not less than b");
		}

		if (a <= b) {
			System.out.println("a is less than or equal to b");
		} else {
			System.out.println("a is neither less than nor equal to b");
		}

		obj.close();

	}

}
