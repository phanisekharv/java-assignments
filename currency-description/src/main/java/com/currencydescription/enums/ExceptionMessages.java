package com.currencydescription.enums;

public enum ExceptionMessages {
	
	SHOULDGREATERTHANZERO("Provided number should be greater than zero")
	,SHOULDLESSTHANLIMIT("Provided number should be less than 999,999,999");
	
	private String message;
	
	ExceptionMessages(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
