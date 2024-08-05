package com.dayfour.assignments;

import java.util.Scanner;

public class AtmSimulation {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int balance = 1000;
		int deposit;
		int withdraw;
		
		do {
			System.out.print("ATM Menu :- \n 1.Check Balance \n 2.Deposit Money \n 3.Withdraw Money \n 4.Exit \n Please Choose an Option :");
			int option = obj.nextInt();
			switch(option) 
			{
			case 1:
				System.out.println("The Balance is: $" +balance);
				break;
				
			case 2:
				System.out.print("Deposit Amount: $");
				deposit = obj.nextInt();
				balance += deposit;
				System.out.println("You have Deposited $" +deposit+ ". Your new balance is $" +balance);
				break;
			case 3:
				System.out.print("Enter amount to withdraw: $");
				withdraw = obj.nextInt();
				if(balance>=withdraw){
					balance -= withdraw;
					System.out.println("You have withdrawn $" +withdraw+ ". Your new balance is $" +balance);		
				}
				else {
					System.out.println("The withdraw amount is greater than balance amount");
				}
				break;
				
			case 4:
				System.out.println("Thank you for using the ATM.Goodbye!");
				System.exit(0);
				
			default:
				System.out.println("Invalid Input. Please select correct option");
				
			}
			
		}
		
		while(true);
		
		
	}
	

}
