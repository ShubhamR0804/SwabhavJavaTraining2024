package com.techlabs.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayList1 {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		List<Integer> numbers =Arrays.asList(10,20,30,40);
		System.out.println(names.size());
		System.out.println(names);
		names.add("Shubham");
		names.add("Parag");
		names.add("Shivam");
		System.out.println(names);
		names.add(2, "Gautam");
		names.add(3, "Yuvi");
		System.out.println(names);
		//names.add(10); Not allowed Since it is constricted to only use string input
		//names.add(10);
		names.remove("Shubham");
		System.out.println(names);
		
	}

}
