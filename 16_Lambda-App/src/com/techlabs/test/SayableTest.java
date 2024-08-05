package com.techlabs.test;

import com.techlabs.model.ISayable;
import com.techlabs.model.SayableImplementaton;

public class SayableTest {
	
	public static void main(String[] args) {
		
		ISayable sayable = new SayableImplementaton();
		sayable.say();
	}

}
