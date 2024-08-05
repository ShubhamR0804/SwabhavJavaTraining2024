package com.array.day2;

import java.util.Scanner;

public class EvenElementsInArray {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = obj.nextInt();
		int array[];
		int evenCount = 0;
		
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
		System.out.print("The even elements of array are : ");
		for (int i = 0; i<size; i++) {
			if(array[i]%2 == 0) {
				System.out.println(array[i] + " ");
				evenCount++;
			    
			}
		}
		System.out.println("The total count of even elements are " +evenCount);
			
	}
		

}

