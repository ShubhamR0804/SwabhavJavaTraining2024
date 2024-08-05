package com.techlabs.test;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		Function<Integer,Integer> squareNumber = (Integer number) -> number*number;
		
		method(squareNumber);
		
	}

	private static void method(Function<Integer, Integer> squareNumber) {
		// TODO Auto-generated method stub
		System.out.println(squareNumber.apply(9));
	}
}
