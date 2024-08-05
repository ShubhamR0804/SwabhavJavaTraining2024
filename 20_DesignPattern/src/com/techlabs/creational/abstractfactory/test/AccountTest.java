package com.techlabs.creational.abstractfactory.test;

import java.util.Scanner;

import com.techlabs.creational.abstractfactory.model.CurrentFactory;
import com.techlabs.creational.abstractfactory.model.IAccount;
import com.techlabs.creational.abstractfactory.model.SavingFactory;

public class AccountTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("choice 1 for Current or 2 for Saving: ");
		int choice = scanner.nextInt();
		if (choice == 1) {
			IAccount currentAccount = new CurrentFactory().makeAccount("Shubham", 54468l, 180d, 180d);
			System.out.println("Credit 500");
			currentAccount.credit(500);
			System.out.println("Debit 250");
			currentAccount.debit(250);
			System.out.println("Debit 1000");
			currentAccount.debit(1000);
			System.out.println("Balance" + currentAccount);
		}
		if (choice == 2) {
			IAccount savingAccount = new SavingFactory().makeAccount("John", 54468l, 180d, 180d);
			System.out.println("Credit 500");
			savingAccount.credit(500);
			System.out.println("Debit 250");
			savingAccount.debit(250);
			System.out.println("Debit 1000");
			savingAccount.debit(1000);
			System.out.println("Balance" + savingAccount);
		}
		scanner.close();
	}

}
