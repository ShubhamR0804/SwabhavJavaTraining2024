package com.techlabs.exceptions;

public class PasswordNotValidException extends RuntimeException {
	
	private String password;

	public PasswordNotValidException(String password) {
	
		this.password = password;
	}
	
	public String getPasswordNotValidMessage() {
		return "Enter Valid Password";
	}
}
