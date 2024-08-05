package com.techlabs.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.techlabs.model.Account;

public class AccountTest {
	
	public static void main(String[] args) {
		
		List<Account> accounts = Arrays.asList(
					 		     new Account(1,"Shubham",5000),
					 		     new Account(2,"Parag",4000),
					 		     new Account(3,"Bhakti",3000),
					 		     new Account(4,"Gaurav",6000));
		
		Optional<Account> minimumBalanceAccount = accounts.stream()
												  .min(Comparator.comparingDouble(Account::getBalance));
		minimumBalanceAccount.ifPresent(account -> System.out.println("Account with minimum balance : " +account));
	
		
		Optional<Account> maximumBalanceAccount = accounts.stream()
				  .max(Comparator.comparingDouble(Account::getBalance));
		maximumBalanceAccount.ifPresent(account -> System.out.println("Account with maximum balance : " +account));
		
		
		List<String> greaterThanSixCharacters = accounts.stream()
												.map(Account::getName)
												.filter(name -> name.length() > 6)
												.collect(Collectors.toList());
		System.out.println("Names with more than 6 characters : " +greaterThanSixCharacters);
		
		System.out.println("The total of all accounts is : " +accounts.stream()
															  .mapToDouble(Account::getBalance)
															  .sum());
		
	}

}
