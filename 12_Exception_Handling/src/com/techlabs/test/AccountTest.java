package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.exceptions.InsufficientBalanceException;
import com.techlabs.exceptions.OverDraftLimitExceededException;
import com.techlabs.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Account account = new Account("Shubham", 100000, 15000);
		try {

			System.out.println("Enter account holder name: " + account.getName());

			accountTransaction(scanner, account);
			account.toString();
		} catch (InsufficientBalanceException exception) {
			System.out.println(exception.getMessage());
		} catch (OverDraftLimitExceededException exception) {
			System.out.println(exception.getMessage());
		} catch (Exception exception) {
			System.out.println("Enter valid input!");
		} finally {
			scanner.close();
		}

	}

	private static void accountTransaction(Scanner scanner, Account account) {
		System.out.println("Enter the choice! \n 1. check balance \n 2. credit \n 3. debit \n 4.Exit");
		int choice = scanner.nextInt();

		double amount;
		switch (choice) {
		case 1:
			System.out.println("Your account has : " + account.getBalance());
			break;
		case 2:
			System.out.println("Enter the amount to credit: ");
			amount = scanner.nextDouble();
			account.credit(amount);
			System.out.println("Your account has : " + account.getBalance());
			break;
		case 3:
			System.out.println("Enter the amount to debit: ");
			amount = scanner.nextDouble();
			if (account.checkOverDraftLimit(amount)) {
				account.debit(amount);
				System.out.println("Your account has : " + account.getBalance());
			}
			// throw new OverDraftLimitExceededException(account.getOverDraftLimit());

			break;

		case 4:
			System.out.println("Thank you for using app, Good Bye!");
			System.exit(-1);
		default:
			break;
		}
		AccountTest.accountTransaction(scanner, account);
	}
}
