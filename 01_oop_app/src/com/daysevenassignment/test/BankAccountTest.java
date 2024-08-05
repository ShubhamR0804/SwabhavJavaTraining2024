package com.daysevenassignment.test;

import java.util.Scanner;
import com.daysevenassignment.model.BankAccount;

public class BankAccountTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Accounts to get details from : ");
		int numberOfAccounts = sc.nextInt();
		BankAccount bankAccount = new BankAccount();
		
		for(int i = 0; i<numberOfAccounts ; i++) {
			System.out.println("Name of Account Owner : ");
			String name = sc.next();
			bankAccount.setName(name);
			
			System.out.println("Account Number : ");
			long accountNumber = sc.nextLong();
			bankAccount.setAccountNumber(accountNumber);
			
			bankAccount.setBalance(2000);
			double balance = bankAccount.getBalance();
			System.out.println("Balance : " + bankAccount.getBalance());
			
			System.out.println("Enter the Withdraw Amount : ");
			double withdrawAmount = sc.nextDouble();
			bankAccount.setWithdraw(withdrawAmount);
			
			if(withdrawAmount>balance) {
				System.out.println("PLEASE NOTE THAT THE WITHDRAW AMMOUNT IS GREATER THAN THE CIRRENT BALANCE. \n  IF YOU WISH TO CONTINUE THE SELECT 1. \n IF YOU WISH TO EXIT TRANSACTION SELECT 2.");
				System.out.print("Enter the option");
				int option = sc.nextInt();
				if(option == 2) {
					System.out.println("You have chosen to exit Transcation.");
					System.exit(-1);
				}
				else 
				{
					System.out.println("You have chosen to continue with transaction and the account will now go in NEGETIVE");
					if(withdrawAmount < 0) {
						double positiveWithdrawAmount = Math.abs(withdrawAmount);
						balance -= positiveWithdrawAmount;
					}
					else 
					{
						balance -= withdrawAmount;
					}
				}
			}
		}
		
		
	}

}
