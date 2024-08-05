package com.techlabs.exceptions;

public class AgeNotValidException extends RuntimeException {
	
	private int age;
	
	public AgeNotValidException(int age) {
		super();
		this.age = age;
	}

	public String getMessage() {
		return "Age not Valid : Age must be more than 18. The Age entered is: " +age;
	}

}
