package com.assignments;

import java.util.Scanner;

public class MinutesToHoursAndMinutes {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter time in minutes:");
		int minutes = obj.nextInt();

		int hours = minutes / 60;
		int remaining_minutes = minutes % 60;

		System.out.println(minutes + " minutes are converted in " + hours + " Hours and " + remaining_minutes + " minutes ");
		
		obj.close();

	}

}
