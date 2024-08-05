package com.proofofcode;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("The value of a :");
		int a = obj.nextInt();
		System.out.println("The value of b :");
		int b = obj.nextInt();
		System.out.println("The value of c :");
		int c = obj.nextInt();
		System.out.println("The value of d :");
		int d = obj.nextInt();
		System.out.println("The value of x :");
		int x = obj.nextInt();
		System.out.println("The value of y :");
		int y = obj.nextInt();
		int e = 0;
		int f = 0;

		System.out.println("Logical Operator AND '&&' ");
		if ((a > b) && (c == d)) {
			e = a + b + c + d;
			System.out.println("The sum stored in e is " + e);
		} else {
			System.out.println("False Condition");
		}
		
		System.out.println("Logical Operator OR '||' ");
		if ((a > b) || (c == d)) {
			f = a + b + c + d;
			System.out.println("The sum stored in f is " + f);
		} else {
			System.out.println("False Condition");
		}
		
		System.out.println("Logical Operator NOT '!' ");
		if (x > y) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		System.out.println("By using NOT operator the values are negated");
		System.out.println("!(x>y) is" +!(x>y));
		
		obj.close();
	}
}
