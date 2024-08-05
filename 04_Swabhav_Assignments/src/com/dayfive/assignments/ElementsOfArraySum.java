package com.dayfive.assignments;

import java.util.Scanner;

public class ElementsOfArraySum {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = obj.nextInt();
		int array[];
		int sum =0;
		
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
		System.out.print("The sum of elements of the array is : ");
		for(int i=0; i<size;i++) {
			sum += array[i];
		}
		System.out.println(sum );
		
		obj.close();
	}

}
