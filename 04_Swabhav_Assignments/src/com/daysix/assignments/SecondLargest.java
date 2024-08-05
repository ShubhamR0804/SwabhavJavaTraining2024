package com.daysix.assignments;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = scanner.nextInt();
		int array[];

		array = new int[size];
		System.out.println("Enter The Elements of Array : ");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();

		}
		int secondLargest = findSecondLargest(array);
		System.out.print("The second largest is : "+secondLargest);

		

	}

	private static int findSecondLargest(int[] array) {
		// TODO Auto-generated method stub
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int value : array) {
			if (value > largest) {
				secondLargest = largest;
				largest = value;
			} else if (value > secondLargest && value != largest) {
				secondLargest = value;
			}
		}

		return secondLargest;
	}
}
