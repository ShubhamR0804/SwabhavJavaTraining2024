package com.techlabs.exceptions;

public class EmailNotValidException extends RuntimeException {

	private String userEmail;

	public EmailNotValidException(String userEmail) {
		super();
		this.userEmail = userEmail;
	}

	public String getEmailNotValidExceptionMessage() {
		return "The entered email is Invalid. The email should contain @ and . and should be of size 5 to 50 characters";
	}

}
