package com.conditionalstatements;

import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter a letter: ");
		char letter = obj.next().charAt(0);
		
		
		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
			System.out.println("The letter entered is a vowel");
		}
		else {
			System.out.println("The letter entered is a consonent");
		}
		
		obj.close();
		
	}
}
