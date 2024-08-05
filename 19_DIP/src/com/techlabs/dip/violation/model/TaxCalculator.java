package com.techlabs.dip.violation.model;

public class TaxCalculator {
	
	private DBLogger dbLogger;

	public TaxCalculator(DBLogger dbLogger) {
		super();
		this.dbLogger = dbLogger;
	}
	
	public int calculateTax(int amount, int rate) {
	try {
        if (amount <= 0) {
            dbLogger.log("Income should be greater than zero");
            return 0;
        }
        return (amount * rate) / 100;
    } catch (Exception e) {
        dbLogger.log("An error occurred: " + e.getMessage());
        return 0;
    }
	}

}
