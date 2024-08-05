package com.assignments;

import java.util.Scanner;

public class BodyMassIndexCalculator {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Weight is : ");
		float weight = obj.nextFloat();
		System.out.println("Height in meter is  : ");
		float height = obj.nextFloat();

		double body_mass_index = weight / (height * height);

		System.out.println("The BodyMassIndex of the user is :" + body_mass_index);

		obj.close();
	}

}
