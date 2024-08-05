package com.proofofcode;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter value of a: ");
		int a = obj.nextInt();
		System.out.println("Enter value of b: ");
		int b = obj.nextInt();
		
		System.out.println("BitWise And operation :-");
		int c = a & b;
		System.out.println("Value of a & b is " +c);
		System.out.println("BitWise OR operation :-");
		int d = a | b;
		System.out.println("Value of a | b is " +d);
		System.out.println("BitWise >> operation :-");
		a >>=1;
		System.out.println("Value left shift of a is: "+a );
		System.out.println("BitWise << operation :-");
		a <<=1;
		System.out.println("Value right shift of a is: "+a );
		
		obj.close();
		
		
		
		
	}
}
