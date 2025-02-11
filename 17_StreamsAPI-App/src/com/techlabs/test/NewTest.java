package com.techlabs.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NewTest {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(20,10,45,35,55);
		
		numbers.stream()
		.forEach((number) -> System.out.println(number));
		 
		List<Integer> filteredNumbers = numbers.stream()
		.filter((number)->(number%2 != 0))
		.filter((number) -> (number>35))
		.collect(Collectors.toList());
		
		List<Integer> squareNumber = numbers.stream()
				.map((number)-> number*number)
				.collect(Collectors.toList());
		
		int sum = numbers.stream().reduce(0,(number1, number2) -> number1+number2);
		System.out.println("Sum : " +sum);
		
		System.out.println(numbers.stream()
				.sorted()
				.collect(Collectors.toList()));
		
		System.out.println("Descending order"+numbers.stream()
				.sorted(Collections.reverseOrder())
				.limit(3)
				.collect(Collectors.toList()));

	Optional<Integer> max=numbers.stream()
	.max((number1,number2) -> number1-number2);
	
	if(max.isPresent())
		System.out.println("Max is :"+max.get());
		
	Optional<Integer>min = numbers.stream()
			.min((number1,number2) -> number2-number1);
	
	if(min.isPresent())
		System.out.println("Min is : " +min.get());
	}			
}
