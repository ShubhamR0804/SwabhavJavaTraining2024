package com.techlabs.test;

import com.techlabs.model.IGreeting;

public class GreetingTest {
public static void main(String[] args) {
	IGreeting greet = name -> System.out.println("Hello "+name );
	greet.say("World");
}
}
