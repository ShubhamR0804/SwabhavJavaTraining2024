package com.techlabs.ocp.solution.test;

import com.techlabs.ocp.solution.model.DiwaliInterest;
import com.techlabs.ocp.solution.model.IFestivalInterest;
import com.techlabs.ocp.solution.model.FixedDeposit;
import com.techlabs.ocp.solution.model.SimpleInterest;

public class FixedDepositTest {
	
	public static void main(String[] args) {
		IFestivalInterest diwaliInterest = new DiwaliInterest();
		FixedDeposit fixedDeposit = new FixedDeposit(1,"Shubham", 5000, 2, diwaliInterest);
		SimpleInterest simpleInterest = new SimpleInterest();
		System.out.println("Simple Interest is : " +simpleInterest.calculateSimpleInterest(fixedDeposit));
	}

}
