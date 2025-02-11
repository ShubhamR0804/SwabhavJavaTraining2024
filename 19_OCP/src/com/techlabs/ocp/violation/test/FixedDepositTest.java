package com.techlabs.ocp.violation.test;

import com.techlabs.ocp.violation.model.FestivalType;
import com.techlabs.ocp.violation.model.FixedDeposit;
import com.techlabs.ocp.violation.model.SimpleInterest;

public class FixedDepositTest {
	
	public static void main(String[] args) {
		FixedDeposit fixedDeposit = new FixedDeposit(1,"Shubham", 5000, 2, FestivalType.DIWALI);
		SimpleInterest simpleInterest = new SimpleInterest(fixedDeposit);
		System.out.println("Simple Interest is : " +simpleInterest.calculateSimpleInterest());
	}

}
