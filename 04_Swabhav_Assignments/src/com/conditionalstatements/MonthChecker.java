package com.conditionalstatements;

import java.util.Scanner;

public class MonthChecker {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
				
		System.out.println("Enter a Month: ");
		int month = obj.nextInt();
				
		switch(month)
		{
		case 1:
		case 10:
		case 11:
		case 12: System.out.println("The season is Winter");
		break;
		case 2:
		case 3:
		case 4:
		case 5:System.out.println("The season is Summer");
		break;
		case 6:
		case 7:
		case 8:
		case 9:System.out.println("The season is Monsoon");
		break;
		default:System.out.println("Calender not from Earth");
		
		
				
		}
		obj.close();

}
	
}
