package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.exceptions.EmailNotValidException;
import com.techlabs.exceptions.PasswordNotValidException;
import com.techlabs.model.EmailVerify;

public class EmailVerifyTest {

	public static void main(String[] args) {

		try {

			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter your email: ");
			String userEmail = scanner.next();

			System.out.print("Enter your password: ");
			String password = scanner.next();

			EmailVerify user = new EmailVerify(userEmail, password);
			System.out.println("User Email is Valid: " + user.getUserEmail());
			//prints the hash value of the password 
			System.out.println("User password is Valid: " + user.getPassword().hashCode());

		} catch (EmailNotValidException exception) {
			System.out.println(exception.getEmailNotValidExceptionMessage());
		} catch (PasswordNotValidException exception) {

			System.out.println(exception.getPasswordNotValidMessage());
		}
	}

}
