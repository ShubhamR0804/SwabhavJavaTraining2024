package com.roughwork;

public class RoughWork {
	

	class Base{
		public void display()
		{
			System.out.println("Base");
		}
		
		public class Derived1 extends Base {
			public void display()
			{
				System.out.println("Inside Derived 1");
			}
		}
		Base base =new Base();
		Derived1 derived=new Derived1();
		
		
	
		
		
	}
	
}
