package com.techlabs.test;

import com.techlabs.model.Itest;
import com.techlabs.test.Reference;

public class ReferenceTest {
	
	public static void main(String[] args) {
		Itest test1 = Reference::new;
		
		
		Itest test2 = Reference :: printStatic;
		
		
		Reference reference = new Reference();
		
		
		
	}

}
