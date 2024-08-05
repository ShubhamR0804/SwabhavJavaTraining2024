package com.daythree.assignments;

import java.util.Scanner;

public class CurrencySorter {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		int amount = obj.nextInt();
		int number_of_2000 = 0;
		int number_of_500 = 0;
		int number_of_200 = 0;
		int number_of_100 = 0;
		
		
		if(amount>50000) {
			System.out.println("Can't withdraw as the limit of 50,000 is exceeded");
		}else if(amount % 100 != 0) {
			System.out.println("The amount should be in multiples of 100");
		}else {
			number_of_2000= amount/ 2000;
			amount = amount % 2000;
			if (number_of_2000 != 0)
			System.out.println("Two Thousand : " +number_of_2000);
			
			number_of_500= amount/500;
			amount = amount %500;
			if (number_of_500 != 0)
			System.out.println("Five Hundred : " +number_of_500);
			
			number_of_200= amount/200;
			amount = amount %200;
			if (number_of_200 != 0)
			System.out.println("Two Hundred : " +number_of_200);
			
			number_of_100= amount/100;
			amount = amount %100;
			if (number_of_100 != 0)
			System.out.println("One Hundred : " +number_of_100);
						
			obj.close();
			
		}
		
	}

}
