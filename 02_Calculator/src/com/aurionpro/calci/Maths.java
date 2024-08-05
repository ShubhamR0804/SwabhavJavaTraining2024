package com.aurionpro.calci;

public class Maths {
/*
	public static void main(String[] args) {
		
		int a = 20;
		int b = 10;
		
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		
		System.out.println("Addition of "+ a +" + "+ b +" is :" +add);
		System.out.println("Subtraction of "+ a +" - "+ b +" is :" +sub);
		System.out.println("Multiplication of "+ a +" * "+ b +" is :" +mul);
		System.out.println("Division of "+ a +" / "+ b +" is :" +div);
		
	}
*/	
	// Method to add two numbers
	public static int add(int a,int b) {
		int add = a + b;
		System.out.println("Addition of "+ a  +" + "+  b +" is :" +add);
		return add;
	}
	
	// Method to subtract two numbers
	public static int sub(int a,int b) {
		int sub = a-b;
		System.out.println("Subtraction of "+ a +" - "+ b +" is :" +sub);
		return sub;	
	}
	
	// Method to multiply two numbers
	public static int mul(int a,int b) {
		int mul = a*b;
		System.out.println("Multiplication of "+ a +" * "+ b +" is :" +mul);
		return mul;	
	}
	
	// Method to divide two numbers
	public static int div(int a,int b) {
		int div = a/b;
		System.out.println("Division of "+ a +" / "+ b +" is :" +div);
		return div;	
	}
}





