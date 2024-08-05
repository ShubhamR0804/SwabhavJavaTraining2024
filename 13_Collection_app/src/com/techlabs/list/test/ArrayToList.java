package com.techlabs.list.test;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class ArrayToList {
	
	public static void main(String[] args) {
		String[] array = {"Shubham", "Shivam", "Gautam", "Yuvi"};
		System.out.println("Print array : " +Arrays.toString(array));
		
		//converting Array to list 
		List<String> list = new ArrayList<String>();
		for (String name : array) {
			list.add(name);
		}
		System.out.println("Print List : " +list);
	}

}
