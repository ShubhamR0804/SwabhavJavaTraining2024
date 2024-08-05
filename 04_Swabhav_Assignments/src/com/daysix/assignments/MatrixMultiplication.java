package com.daysix.assignments;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) throws Exception {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number of rows for matrix A : ");
		int rowsA = obj.nextInt();
		System.out.println("Enter number of columns for matrix A : ");
		int columnsA = obj.nextInt();

		int matrixA[][] = new int[rowsA][columnsA];

		System.out.println("Enter the elements for matrix A : ");

		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < columnsA; j++) {
				matrixA[i][j] = obj.nextInt();
			}
		}

		System.out.println("Matrix A is : ");
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < columnsA; j++) {
				System.out.print(matrixA[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("Enter number of rows for matrix B : ");
		int rowsB = obj.nextInt();
		System.out.println("Enter number of columns for matrix B : ");
		int columnsB = obj.nextInt();

		int matrixB[][] = new int[rowsB][columnsB];

		System.out.println("Enter the elements for matrix B : ");

		for (int i = 0; i < rowsB; i++) {
			for (int j = 0; j < columnsB; j++) {
				matrixB[i][j] = obj.nextInt();
			}
		}

		System.out.println("Matrix B is : ");
		for (int i = 0; i < rowsB; i++) {
			for (int j = 0; j < columnsB; j++) {
				System.out.print(matrixB[i][j] + "\t");
			}
			System.out.println(" \n ");
		}

		if (columnsA != rowsB) {
			System.out.println("Invalid matrix given \n Program Terminated!");
			System.exit(-1);
		}

		int matrixC[][] = new int[rowsA][columnsB];

		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < columnsB; j++) {
				for (int k = 0; k < columnsA; k++) {
					matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
				}
			}
		}

		System.out.println("Matrix A * Matrix B : ");
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < columnsB; j++) {
				System.out.print(matrixC[i][j] + "\t");

			}
			System.out.println();
		}
		obj.close();

	}

}
