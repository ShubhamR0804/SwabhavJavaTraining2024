package com.commandline;

public class SumOfNumberCommandLine {
		public static void main(String[] args) {

			int number1 = Integer.parseInt(args[0]);
			System.out.println("Enter the value of a : " +number1);
			int number2 = Integer.parseInt(args[1]);
			System.out.println("Enter the value of b : " +number2);
			

			int add = number1 + number2;

			System.out.println("Addition of number1:" + number1 + " and number2:" + number2 + " is :" + add);

		

		

	}

}
