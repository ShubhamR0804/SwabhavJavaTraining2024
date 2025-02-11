package com.techlabs.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestString {
	public static void main(String[] args) {
		String[] names = {"Jayesh", "Nimesh", "Mark", "Mahesh", "Ramesh"};

		List<String> sortedFirstThree = Arrays.stream(names)
										.limit(3)
										.sorted()
										.collect(Collectors.toList());
		
		System.out.println("First Three : "+sortedFirstThree);
		
		List<String> sortedFirstThreeWithA = Arrays.stream(names)
				 							 .filter(name -> name.contains("a"))
				 							 .limit(3)
				 							 .sorted()
				 							 .collect(Collectors.toList());
		
		System.out.println("First Three Containing A : "+sortedFirstThreeWithA);
		
		List<String> studentsInDescending = Arrays.stream(names)
											.sorted(Collections.reverseOrder())
											.collect(Collectors.toList());

		System.out.println("In Descending : "+studentsInDescending);
		
		List<String> firstThreeChars = Arrays.stream(names)
									   .map(name -> name.length() > 3 ? name.substring(0, 3) : name)
									   .collect(Collectors.toList());

		System.out.println("The first three characters of all : " +firstThreeChars);
		
		List<String> lessThanFour = Arrays.stream(names)
									.filter(name -> name.length() <= 4)
									.collect(Collectors.toList());
					
		System.out.println("Names containing less than 4 characters : "+lessThanFour);
		
	}
}
