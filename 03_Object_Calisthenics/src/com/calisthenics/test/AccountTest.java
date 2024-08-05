package com.calisthenics.test;

import com.calisthenics.model.AccountType;
import com.calisthenics.model.BankAccount;

public class AccountTest {
	
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount(01,"Shubham",12345667, AccountType.savings);
		
		System.out.println(account1);
	}

}
