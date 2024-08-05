package com.techlabs.test;

import com.techlabs.model.Base;
import com.techlabs.model.Derived1;
import com.techlabs.model.Derived2;

public class BaseTest extends Derived2{
	
	public static void main(String[] args) {
		
		Base base = new Base();
		base.display();
		Derived1 derived1 = new Derived1();
		derived1.display();
		Derived2 derived2 = new Derived2();
		derived2.display();
		
		base = derived1;
		base.display1();
		
		
	}

}
