package com.daysix.assignments;

import java.util.Scanner;

public class PeakElements {
	public static int[] findPeakElements(int[] arr) {
		int n = arr.length;
		int[] tempPeaks = new int[n]; // Temporary array to store peak elements
		int peakCount = 0;

		// Edge case: If the array has only one element, it is a peak
		if (n == 1) {
			return new int[] { arr[0] };
		}

		// Check if the first element is a peak
		if (arr[0] >= arr[1]) {
			tempPeaks[peakCount++] = arr[0];
		}

		// Check the middle elements
		for (int i = 1; i < n - 1; i++) {
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
				tempPeaks[peakCount++] = arr[i];
			}
		}

		// Check if the last element is a peak
		if (arr[n - 1] >= arr[n - 2]) {
			tempPeaks[peakCount++] = arr[n - 1];
		}

		// Create the result array with exact size
		int[] peaks = new int[peakCount];
		System.arraycopy(tempPeaks, 0, peaks, 0, peakCount);

		return peaks;
	}

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
		
		// int[] array = {1, 3, 5, 4, 2};
		int[] peakElements = findPeakElements(array);
		System.out.println("\n");
		//for each loop created to iterate through each element in peakElements 
		//value of current element is assigned to peak variable
		for (int peak : peakElements) {
			System.out.println("The Peak element is : " + peak); // Output: 5
		}
		
		obj.close();
	}
}
