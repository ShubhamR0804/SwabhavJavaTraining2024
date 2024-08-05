package com.daythree.assignments;

import java.util.Scanner;

public class TreasureIsland {

	public static void main(String[] args) {

		System.out.println("Welcome to treasure island island. Your mission is to find treasure");

		Scanner obj = new Scanner(System.in);
		System.out.println("Left or Right");
		String direction = obj.nextLine().toLowerCase();

		System.out.println("Swim or Wait");
		String action = obj.nextLine().toLowerCase();

		System.out.println("Which color door: ");
		String door = obj.nextLine().toLowerCase();

		if (direction.equals("left")) {
			if (action.equals("wait")) {
				switch (door) {
				case "yellow":
					System.out.println("You Win!");
					break;
				case "red":
					System.out.println("Burned by Fire. \n Game Over.");
					break;
				case "blue":
					System.out.println("Eaten By Beasts. \n Game Over.");
					break;
				default:
					System.out.println("Game Over");
				}
			} else {
				System.out.println("Attacked bye trout. \n Game Over.");

			}
		} else {
			System.out.println("Fall into a hole. \t Game Over.");
		}

		obj.close();
	}

}
