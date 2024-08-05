package com.trial.test;

import com.trial.enumerator.AccountType;
import com.trial.exception.InsufficientBalanceException;
import com.trial.exception.OverDraftLimitExceededException;
import com.trial.model.Account;
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account currentAccount = new Account("Shubham", 100000, 15000, 5000, AccountType.current);
		System.out.println("Name of account Holder : " + currentAccount.getName());
		while (true) {
			// ATM transaction menu
			
			System.out.println("ATM Transaction Menu:");
			System.out.println("1. Check Balance");
			System.out.println("2. Credit");
			System.out.println("3. Debit");
			System.out.println("4. Exit");

			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			if (choice == 4) {
				System.out.println("Exiting ATM");
				break;
			}

			double amount = 0;
			if (choice == 2 || choice == 3) {
				System.out.print("Enter the amount: ");
				amount = scanner.nextDouble();
			}

			try {
				accountTransaction(currentAccount, choice, amount);
			} catch (InsufficientBalanceException | OverDraftLimitExceededException exception) {
				System.out.println(exception.getMessage());
			}
		}

		scanner.close();
	}

	private static void accountTransaction(Account account, int choice, double amount) {

		switch (choice) {
		case 1:
			System.out.println("Balance: " + account.getBalance());
			break;
		case 2:
			account.credit(amount);
			System.out.println("Credited " + amount + ". New balance: " + account.getBalance());
			break;
		case 3:
			account.debit(amount);
			System.out.println("Debited " + amount + ". New balance: " + account.getBalance());
			break;
		case 4:
			System.out.println("Exiting ATM");
			break;
		default:
			System.out.println("Invalid choice");
		}
	}

}
