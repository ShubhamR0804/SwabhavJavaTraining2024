package com.techlabs.test;

import java.util.function.BiPredicate;

public class BiPredicate1 {
	
	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> numberCompare = (Integer number1, Integer number2) -> (number1>number2);
		System.out.println(numberCompare.test(100, 20));
	}

}
