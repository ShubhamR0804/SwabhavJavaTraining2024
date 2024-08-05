package com.stackandheap;

public class StringBufferStackAndHeap {
	
	public static void main(String[] args) {
		
		System.out.println("This is StringBuffer method");
		
		StringBuffer name1 = new StringBuffer("Shubham");
		System.out.println(name1.hashCode());
		name1 = name1.append("Ramteke");
		System.out.println(name1.hashCode());
		
		System.out.println("This is StringBuilder method");
		
		StringBuilder name2 = new StringBuilder("Shivam");
		System.out.println(name2.hashCode());
		name2 = name2.append("Upadhyay");
		System.out.println(name2.hashCode());
		
		
	}

}
