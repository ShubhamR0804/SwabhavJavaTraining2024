package com.techlabs.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(10,20,30,40);
	
	Stream<Integer> numbersStream = numbers.stream();
	
	numbersStream.forEach((number) -> System.out.println(numbers));
}
}
