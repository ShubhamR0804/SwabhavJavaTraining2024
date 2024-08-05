package com.techlabs.exceptions;

public class OverDraftLimitExceededException extends RuntimeException {
	
	private double overDraftLimit;

	public OverDraftLimitExceededException(double overDraftLimit) {
		super();
		this.overDraftLimit = overDraftLimit;
	}
	
	public String getMessage() {
		return "The Over-Draft limit exceeded. The Limit is  " +overDraftLimit;
	}

}
