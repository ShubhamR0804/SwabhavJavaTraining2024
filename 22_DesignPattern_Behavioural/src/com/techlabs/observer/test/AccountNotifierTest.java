package com.techlabs.observer.test;

import java.util.Scanner;

import com.techlabs.observer.model.Account;
import com.techlabs.observer.model.EmailNotifier;
import com.techlabs.observer.model.InsufficientFundsException;
import com.techlabs.observer.model.SmsNotifier;
import com.techlabs.observer.model.WhatsappNotifier;

public class AccountNotifierTest {

	public static void main(String[] args) {
		Account account = new Account(1, "Shubham", 1000);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Which notifications do you want? (1: SMS, 2: Email, 3: WhatsApp, 4: All)");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			account.registerNotifier(new SmsNotifier());
			break;
		case 2:
			account.registerNotifier(new EmailNotifier());
			break;
		case 3:
			account.registerNotifier(new WhatsappNotifier());
			break;
		case 4:
			account.registerNotifier(new SmsNotifier());
			account.registerNotifier(new EmailNotifier());
			account.registerNotifier(new WhatsappNotifier());
			break;
		default:
			System.out.println("Invalid choice.");
			return;
		}

		try {
			account.deposit(500);
			account.withdraw(200);
			account.withdraw(1500); // This will throw InsufficientFundsException
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(account);

	}

}
