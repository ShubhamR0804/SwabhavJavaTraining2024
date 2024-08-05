package com.multidimensionalarray;

import java.util.Scanner;

public class SumOfAllElementsOfMultiDimensionalArray {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int rows = scanner.nextInt();
		System.out.println("Enter number of columns : ");
		int columns = scanner.nextInt();
		int sum = 0;
		
		int matrix[][] = new int[rows][columns]; 
		
		System.out.println("Enter the elements : ");
		
		for(int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("The matrix is : ");
		for(int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				System.out.print(matrix[i][j]+ "\t");
			}
			System.out.println();
		}
		
		System.out.println("The sum of elements are : ");
		for(int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				sum += matrix[i][j];	
			}
		}
		System.out.println(sum);
		scanner.close();
	}

}
