package com.techlabs.test;

import com.techlabs.model.IAddition;

public class AdditionTest {
	
	public static void main(String[] args) {
		
		IAddition addition = (number1, number2) -> number1 + number2;
		System.out.println("Addition is : " +
		addition.add(10, 20));
	}

}
