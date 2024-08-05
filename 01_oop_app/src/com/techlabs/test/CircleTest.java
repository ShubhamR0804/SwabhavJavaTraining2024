package com.techlabs.test;

import java.util.Scanner;
import com.techlabs.model.Circle;

public class CircleTest {

	
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		double radius = sc.nextDouble();		
		Circle circle = new Circle(radius);
		

		
		circle.setRadius(radius);
		System.out.println("Radius : " + circle.getRadius());
		circle.calculateArea();

		sc.close();
	}

}
