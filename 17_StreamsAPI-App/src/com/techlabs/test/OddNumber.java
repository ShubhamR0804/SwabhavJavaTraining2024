package com.techlabs.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class OddNumber {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(15,25,35,45,55);
		
		numbers.stream()
		.forEach((number) -> System.out.println(number));
		 
		numbers.stream()
		.filter((number)->(number%2 != 0))
		.filter((number) -> (number>35))
		.collect(Collectors.toList())
		.stream()
		.forEach((number)->System.out.println(number));
		
}
}
