package com.debugging;

import java.util.Scanner;


public class DebuggerTest {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in); // new scanner object "obj" is created
		System.out.println("Enter the value of a : ");
		int number1 = obj.nextInt(); // accepts integer values
		System.out.println("Enter the value of b : ");
		int number2 = obj.nextInt();
		
	    int sum = add(number1, number2);
	    System.out.println("Addition is: "+sum);
	    
	    int mul = multiply(number1, number2);
	    System.out.println("Multiplication is: "+mul);
	    
	    int div = divide(number1,number2);
	    System.out.println("Division is :" +div);
	    
	    int sub = subtract(number1,number2);
	    System.out.println("Subtraction is :" +sub);
	}

	private static int subtract(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1-number2;
	}

	private static int divide(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1/number2;
	}

	private static int multiply(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1*number2;
	}

	private static int add(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1+number2;
	}

}
