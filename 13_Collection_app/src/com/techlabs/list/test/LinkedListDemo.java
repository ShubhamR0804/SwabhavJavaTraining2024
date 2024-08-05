package com.techlabs.list.test;

import java.util.LinkedList;

 
public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		System.out.println(numbers);
		numbers.addFirst(30);
		numbers.addLast(1);
		System.out.println(numbers.removeFirstOccurrence(4));
	}
}
