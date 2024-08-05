package com.calisthenics.test;


import java.util.regex.*;
import java.util.Scanner;

public class ValidatePassword {
	
	public static boolean isValidPassword (String password1){
		
		Scanner scanner = new Scanner(System.in);
		String password = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
		System.out.println("Enter Password : " );
		Pattern pattern = Pattern.compile(password1);
		
		if(password == null || password.length()<8 || password.length()>20)
		{
			return false;
		}
		
		Matcher match = pattern.matcher(password1);
		return match.matches();

		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Password : ");
		String password = scanner.next();
		System.out.println("Password is : "+isValidPassword(password));
	}
	

}
