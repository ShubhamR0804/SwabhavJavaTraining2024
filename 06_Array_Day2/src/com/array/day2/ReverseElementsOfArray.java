package com.array.day2;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseElementsOfArray {
	
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
		System.out.println("The reversed array is : ");
		for(int i = 0; i<size/2 ; i++) {
			int temp = array[i];
			array[i]=array[size-i-1];
			array[size-i-1] = temp;
		}
		System.out.println(Arrays.toString(array));
	}

}
