package com.stackandheap;

public class StackAndHeap {
	public static void main(String[] args) {
		String name1 = " At ";
		String name2 = " At ";
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name1 == name2);
		String name3 = "b";
		System.out.println(name3.hashCode());
		name3 = name3 + "M" ;
		System.out.println(name3.hashCode());
		String name4 = new String("At");
		String name5 = new String("At");
		System.out.println(name4 == name5);

	}
	
}
