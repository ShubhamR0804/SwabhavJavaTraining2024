package com.conditionalstatements;

import java.util.Scanner;

public class VowelChecker {
	
	public static void main(String[] args) {
		
Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter a letter: ");
		char letter = obj.next().charAt(0);
		
		switch(letter)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':System.out.println("Vowel");
		break;
		default:System.out.println("Not a vowel");
		}
		obj.close();
	}

}
