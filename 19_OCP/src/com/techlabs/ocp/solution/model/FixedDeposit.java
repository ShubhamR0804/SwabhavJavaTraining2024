package com.techlabs.ocp.solution.model;

public class FixedDeposit {
	
	private int accountNumber;
	private String name;
	private double principal;
	private int duration;
	private IFestivalInterest festival;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public IFestivalInterest getFestival() {
		return festival;
	}
	public void setFestival(IFestivalInterest festival) {
		this.festival = festival;
	}
	public FixedDeposit(int accountNumber, String name, double principal, int duration, IFestivalInterest festival) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
	}
	@Override
	public String toString() {
		return "FixedDeposit [accountNumber=" + accountNumber + ", name=" + name + ", principal=" + principal
				+ ", duration=" + duration + ", festival=" + festival + "]";
	}
	
	
}
