package com.daysix.assignments;

import java.util.Scanner;

public class ProductOfRemainingElementOfArray {

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

		int[] outputArray = productExceptSelf(array);

		// Print the result
		for (int value : outputArray) {
			System.out.print(value + " ");
		}
	}

	public static int[] productExceptSelf(int[] numbers) {
		int length = numbers.length;
		int[] product = new int[length];

		for (int i = 0; i < length; i++) {
			product[i] = 1;
		}

		// Calculate the products of all elements to the left of each element
		int leftProduct = 1;
		for (int i = 0; i < length; i++) {
			product[i] *= leftProduct;
			leftProduct *= numbers[i];
		}

		// Calculate the products of all elements to the right of each element
		int rightProduct = 1;
		for (int i = length - 1; i >= 0; i--) {
			product[i] *= rightProduct;
			rightProduct *= numbers[i];
		}

		return product;
	}

}
