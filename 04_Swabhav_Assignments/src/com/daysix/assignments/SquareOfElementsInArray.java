package com.daysix.assignments;

import java.util.Scanner;

public class SquareOfElementsInArray {

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
		sortArray(array);
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + "\t");
		}

		System.out.println("\n");
		System.out.print("The square of sorted elements in array : ");
		int[] sortedSquareOfElementsOfArray = sortedSquares(array);
		for (int number : sortedSquareOfElementsOfArray) {
			System.out.print(number + " ");

		}
		obj.close();

	}

	public static void sortArray(int[] array) {

		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < (array.length - i); j++) {

				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}

		}
	}

	public static int[] sortedSquares(int[] nums) {

		int n = nums.length;
		int[] result = new int[n];
		int left = 0; // Start pointer
		int right = n - 1; // End pointer
		int index = n - 1; // Index for the result array

		while (left <= right) {
			if (Math.abs(nums[left]) > Math.abs(nums[right])) {
				result[index--] = nums[left] * nums[left];
				left++;
			} else {
				result[index--] = nums[right] * nums[right];
				right--;
			}
		}

		return result;
	}
}
