package com.trial.exception;

public class OverDraftLimitExceededException extends RuntimeException {

	public OverDraftLimitExceededException(String message) {
		super(message);

	}

}
