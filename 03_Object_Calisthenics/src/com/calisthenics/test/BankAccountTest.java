package com.calisthenics.test;

import java.util.Scanner;

import com.calisthenics.model.AccountType;
import com.calisthenics.model.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankAccount accounts[] = new BankAccount[2];

		for (int i = 0; i < accounts.length; i++) 
		{
			System.out.println("Enter Account Number:");
			int accountNumber1 = scanner.nextInt();
			System.out.println("Enter Name:");
			String name1 = scanner.next();
			System.out.println("Enter Balance");
			int balance1 = scanner.nextInt();
			System.out.println("Enter Account Type:");
			String accountType1 = scanner.next();

			accounts[i] = new BankAccount(int accountNumber, String name, double balance,AccountType accountType);
		}

		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Account Number:" + accounts[i].getAccountNumber());
			System.out.println("Name:" + accounts[i].getName());
			System.out.println("Balance:" + accounts[i].getBalance());
			System.out.println("Account Type:" + accounts[i].getAccountType());

		}

		System.out.println("Transaction Menu:");
		System.out.println("1. Deposit Money");
		System.out.println("2. Withdraw Money");
		System.out.println("Please choose an option:");

		int choice = scanner.nextInt();
		switch (choice) {

		case 1:
			System.out.println("Enter Amount to be Deposited:");
			int amount = scanner.nextInt();
			accounts[0].deposit(amount);
			break;
		case 2:
			System.out.println("Enter Amount to be Withdrawn:");
			amount = scanner.nextInt();
			accounts[0].withdraw(amount);
			break;

		default:
			System.out.println("Incorrect choice");
		}

		BankAccount maxAccount = getMaximumBalanceAccount(accounts);
		if (maxAccount != null) {
			System.out.println("Account with Maximum Balance:");
			System.out.println(maxAccount.getName());
			System.out.println(maxAccount.getBalance());

		} else {
			System.out.println("No accounts available.");
		}

		scanner.close();

	}

	public static BankAccount getMaximumBalanceAccount(BankAccount[] accounts) {
		if (accounts.length == 0) {
			return null;
		}

		BankAccount maxAccount = accounts[0];
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() > maxAccount.getBalance()) {
				maxAccount = accounts[i];
			}
		}
		return maxAccount;
	}

}
