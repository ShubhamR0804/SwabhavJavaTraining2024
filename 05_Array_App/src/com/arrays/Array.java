package com.arrays;

import java.util.Scanner;

public class Array {
	
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
		
		obj.close();
	}

}
