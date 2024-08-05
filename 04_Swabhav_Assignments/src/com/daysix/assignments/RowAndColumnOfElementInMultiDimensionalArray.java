package com.daysix.assignments;

import java.util.Scanner;

public class RowAndColumnOfElementInMultiDimensionalArray {

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

		System.out.println("Enter the number to search in the matrix : ");
		int number = scanner.nextInt();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (number == matrix[i][j]) {
					System.out
							.println("The number : " + number + " is at row : " + (i + 1) + " and column : " + (j + 1));
				}
			}
		}
		scanner.close();

	}

}
