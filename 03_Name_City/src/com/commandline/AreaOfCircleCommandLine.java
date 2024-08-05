package com.commandline;

public class AreaOfCircleCommandLine {
	public static void main(String[] args) {
		
		System.out.println("enter radius:");
		int radius=Integer.parseInt(args[0]);
		
		double area = 3.14 * radius * radius;
		
		System.out.println("The area of circle is "+area);
	}

}
