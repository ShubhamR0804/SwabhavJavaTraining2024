package com.dayfour.assignments;

import java.util.Random;
import java.util.Scanner;

public class GuessWords {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		String[] words = {"hello","adequate","parliament","vehical"};
		Random random = new Random();
		
		int randomIndex = random.nextInt(words.length);
		//System.out.println(words[randomIndex]);
		
		String secretword = words[randomIndex].replaceAll("[a-zA-z]", " _ ");
		System.out.println(secretword+ "\n \nGuess the word" );
		String guessed = obj.nextLine().toLowerCase();
		System.out.println("The Guessed letter is : " +guessed);
		
		if(words[randomIndex].contains(guessed)) {
			System.out.println("The letter guessed is present in the Secret Word");
		}else {
			System.out.println("The letter guessed is Not present in the Secret Word");
			
		}
		obj.close();
		//String secretword = words[randomIndex].replace("[a-zA-z]", " _ ");
		
	}

}
