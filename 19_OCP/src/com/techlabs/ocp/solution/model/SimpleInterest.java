package com.techlabs.ocp.solution.model;

public class SimpleInterest {

	public double calculateSimpleInterest(FixedDeposit fixedDeposit) {
		return (fixedDeposit.getPrincipal()*fixedDeposit.getDuration()*fixedDeposit.getFestival().getInterestRate()) / 100 ;
	}
}
