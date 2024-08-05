package com.dayfour.assignments;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesserGame {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		Random rand = new Random();
		int randomNumber = rand.nextInt(100) + 1;
		System.out.println("Random Generated Number is " + randomNumber);
		System.out.println("You get 5 lives");
		int lives = 5;

		while (lives > 0) {
			lives--;
			System.out.println("Guess a number... ");
			int guess = obj.nextInt();

			if (guess == randomNumber) {
				System.out.println("You won, You guessed it right in  " + (5 - lives) + " attempt");
				lives = 0;
			} else if (guess < randomNumber) {
				System.out.println("sorry the number is too low");
				System.out.println("You have "+lives+ " lives left");
			} else {
				System.out.println("sorry the number is too high");
				System.out.println("You have "+lives+ " lives left");
				
			}

			if (lives == 0) {
				System.out.println("Do you want to play the game again: yes/no");
				String userAnswer = obj.next().toLowerCase();
				if (userAnswer.equals("yes")) {
					lives = 5;
					randomNumber = rand.nextInt(100) + 1;
					System.out.println("Random Generated Number is " + randomNumber);
				} else {
					System.out.println("You lost, Game Over");
				}
			}
		}
		
		obj.close();
	}
}
