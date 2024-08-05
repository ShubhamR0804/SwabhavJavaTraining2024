package com.calisthenics.test;

import java.util.Scanner;

public class MatrixTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int matrix[][] = new int[3][3];
		System.out.println("Enter the elements of Matrix :");

		createRows(matrix, scanner);

		System.out.println("The Matrix is : ");

		displayMatrix(matrix);

	}

	private static void createRows(int[][] matrix, Scanner scanner) {
		for (int row = 0; row < 3; row++) {
			readRowElements(matrix, scanner, row);
		}
	}

	private static void readRowElements(int[][] matrix, Scanner scanner, int row) {
		for (int j = 0; j < 3; j++) {
			matrix[row][j] = scanner.nextInt();
		}
	}

	private static void displayRow(int[][] matrix, int row) {
		for (int col = 0; col < 3; col++) {
			System.out.println(matrix[row][col] + "\t");
		}
	}

	private static void displayMatrix(int matrix[][]) {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(matrix[row][col] + "\t");
			}
			System.out.println(" ");

		}
	}

}
