package com.dayfive.assignments;

import java.util.Scanner;

public class DuplicateElementsInArray {

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
		for (int i = 0; i < size; i++) {
			for(int j=0; j<i ; j++) {
				if (array[i]==array[j]) {
					System.out.println("The Duplicate element is : " +array[j]+ " which is located : " +i);
				}
			}

		}
		obj.close();
	}

}
