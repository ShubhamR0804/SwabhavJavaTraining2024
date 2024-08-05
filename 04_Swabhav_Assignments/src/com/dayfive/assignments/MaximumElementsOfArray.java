package com.dayfive.assignments;

import java.util.Scanner;

public class MaximumElementsOfArray {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = obj.nextInt();
		int array[];

		array = new int[size];
		System.out.println("Enter The Elements of Array : ");
		for (int i = 0; i < size; i++) {
			array[i] = obj.nextInt();
		}
		
		System.out.print("Array is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + "\t");
		}

		System.out.println("\n");
		int max = array[0];
		System.out.print("The maximum element of an array is : ");
		for (int i = 0; i < size; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.println(max);

		obj.close();
	}

}
