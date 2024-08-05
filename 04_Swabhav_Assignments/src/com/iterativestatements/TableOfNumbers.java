package com.iterativestatements;

import java.util.Scanner;

public class TableOfNumbers {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = obj.nextInt();
		int i;
		int table=0;
		for(i=1;i<=10;i++) {
			table = number * i;
			System.out.println(+number+ " x " +i+ " : " +table);
		}
		obj.close();
	}

}
