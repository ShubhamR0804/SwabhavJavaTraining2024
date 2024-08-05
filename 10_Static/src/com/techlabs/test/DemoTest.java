package com.techlabs.test;

import com.techlabs.model.Demo;

public class DemoTest {

	public static void main(String[] args) {
		
		Demo demo1 = new Demo();
		System.out.println("Display of Demo 1 obj before increment");
		demo1.display();
		Demo.increments();
		System.out.println("Display of Demo 1 obj after increment");
		demo1.display();
		
		System.out.println();
		Demo demo2= new Demo();
		System.out.println("Display of Demo 2 obj before increment");
		demo2.display();
		Demo.increments();
		System.out.println("Display of Demo 2 obj after increment");
		demo2.display();
		
		System.out.println();
		Demo demo3 = new Demo();
		System.out.println("Display of Demo 3 obj before increment");
		demo3.display();
		Demo.increments();
		System.out.println("Display of Demo 3 obj after increment");
		demo3.display();
				
	}

	static {
		System.out.println("hello1");
	}
	
}
