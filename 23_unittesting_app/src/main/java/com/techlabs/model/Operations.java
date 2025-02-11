package com.techlabs.model;

public class Operations {
	
	public int addition(int number1, int number2) {
		return number1+number2;
	}
	
	public int subtraction(int number1, int number2) {
		return number1-number2;
	}
	
	public int multiplication(int number1, int number2) {
		return number1*number2;
	}
	
	public int division(int number1, int number2) {
		if(number2==0) 
			throw new ArithmeticException();
		return number1/number2;
	}
	
	public int[] squareOfArrayElement(int numbers[])
	{
		for(int i=0; i<numbers.length; i++)
			numbers[i]=numbers[i]*numbers[i];
		
		return numbers;
	}
	
	public boolean isEven(int number) {
		return number%2==0;
	}

}
