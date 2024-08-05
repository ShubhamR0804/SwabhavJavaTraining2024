package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.exceptions.AgeNotValidException;
import com.techlabs.model.Voter;

public class VoterTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Voter Id : " );
		int voterId = scanner.nextInt();
		
		System.out.println("Enter Voter First Name :");
		String firstName = scanner.next(); 
		
		System.out.println("Enter Voter Last Name :");
		String lastName = scanner.next(); 
	
		System.out.println("Enter Voter age : " );
		int voterAge = scanner.nextInt();
		Voter voter = null;
		try {
		voter = new Voter(voterId, firstName, lastName, voterAge);
		
		}
		catch(AgeNotValidException exception)
		{
			System.out.println(exception.getMessage());
		}
		System.out.println(voter);
	}

}
