package com.dayfive.assignments;

import java.util.Scanner;

public class ExistenceOfElementInArray {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = obj.nextInt();
		int array[];
		
		array = new int[size];
		System.out.println("Enter The Elements of Array : ");
		for(int i=0; i<size;i++) {
			array[i]=obj.nextInt();
			
		}
		System.out.print("Array is: ");
		for(int i=0; i<size;i++) {
			System.out.print(array[i] + "\t");
		}
		
		System.out.println("\n");
		System.out.println("Enter the number to verify it's existence in the array : ");
		int verifyNumber = obj.nextInt();
		for(int i=0; i<size; i++) {
			if(array[i] == verifyNumber) {
				System.out.println("The element is present at index position " +i);
			
		}
		}
		obj.close();
	}

}
