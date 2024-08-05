package com.techlabs.test;

import com.techlabs.model.*;

public class AccountTest {
	
	public static void main(String[] args) {
		
		SavingsAccount savingsAccount = new SavingsAccount("Shubham",1234556, 01, 10000);
		CurrentAccount currentAccount = new CurrentAccount("Shubham",123456, 01, 1200 );
		
		
		System.out.println(savingsAccount);
		System.out.println(currentAccount);
 	}

}
