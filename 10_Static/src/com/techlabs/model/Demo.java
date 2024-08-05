package com.techlabs.model;

public class Demo {

	{
		System.out.println("2");
	}
	private static int a = 1;
	private int b = 1;
	private static int c = 1;

	public static void increments() {
		a++;
		// b++;
		c++;
	}

	public void display() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

	static {
		System.out.println("1");
	}

	static {
		System.out.println("5");
	}

	{
		System.out.println("3");
	}
}
