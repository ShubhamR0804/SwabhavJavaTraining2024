package com.daysix.assignments;

import java.util.Scanner;

public class SumOfElementsInARowOfMatrix {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int rows = scanner.nextInt();
		System.out.println("Enter number of columns : ");
		int columns = scanner.nextInt();

		int matrix[][] = new int[rows][columns];

		System.out.println("Enter the elements : ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("The matrix is : ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		int sum = 0;
		System.out.println("\n");
		System.out.println("Sum of Each Row ");
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < columns; ++j) {
				sum += matrix[i][j];
			
			}
			System.out.println("The sum of row " +i+ " is " +sum);
			sum = 0;
			
			scanner.close();
			
		}
	}

}
