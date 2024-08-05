package com.techlabs.ocp.violation.model;

public enum FestivalType {
	NEWYEAR(8),
    DIWALI(7.5),
    HOLI(8.5),
    OTHER(6.5);

    private double interestRate;

    FestivalType(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

}
