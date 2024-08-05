package com.dayfour.assignments;

import java.util.Random;
import java.util.Scanner;

public class GuessWord {

	String addSpaces(String word) {
		String newWord = "";
		for (int i = 0; i < word.length(); i++) {
			newWord += word.charAt(i) + " ";
		}
		return newWord;
	}

	String replaceCharAtIndex(String word, int index, char letter) {
		return word.substring(0, index) + letter + word.substring(index + 1);
	}

	String askToGuess(Scanner input, String answer, String wordHolder) {

		System.out.println("Guess a letter! ");
		String modifiedWordHolder = wordHolder;
		char letter = input.next().toLowerCase().charAt(0);
		for (int i = 0; i < answer.length(); i++) {
			if (answer.charAt(i) == letter) {
				if (wordHolder.charAt(i) == letter) {
					System.out.println("Already Filled!");
					return modifiedWordHolder;
				}
				modifiedWordHolder = this.replaceCharAtIndex(modifiedWordHolder, i, letter);
			}
		}

		if (modifiedWordHolder.equals(wordHolder)) {
			return "";
		}
		return modifiedWordHolder;
	}

	public static void main(String[] args) {
		String[] wordList = { "hello", "festival", "swabhav", "aurionpro", "orange", "litchee" };
		Random ran = new Random();

		String randomWord = wordList[ran.nextInt(wordList.length)].toLowerCase();
		int lives = randomWord.length() - 1;

		String wordHolder = "";
		for (int i = 0; i < randomWord.length(); i++) {
			wordHolder += "_";
		}

		Scanner input = new Scanner(System.in);
		GuessWord wordGuesser = new GuessWord();

		System.out.println("Welcome to word guesser!");
		System.out.println("fill in the blanks");

		while (lives > 0) {
			System.out.println();
			System.out.println(wordGuesser.addSpaces(wordHolder));
			System.out.println();

			String modifiedWordHolder = wordGuesser.askToGuess(input, randomWord, wordHolder);

			if (modifiedWordHolder.isEmpty()) {
				System.out.println("Your guess was wrong!");
				lives--;
				System.out.println("You lost a live");
				System.out.println("Remaining Lives " + lives);
				if (lives == 0) {
					System.out.println("Game Over");
				}
			} else {
				wordHolder = modifiedWordHolder;
				// check if wordHolder has blanks
				if (!modifiedWordHolder.contains("_")) {
					System.out.println(randomWord);
					System.out.println("The Word Guessed was Correct");
					lives = 0;
				}
				;
			}

		}
		input.close();
	}
}