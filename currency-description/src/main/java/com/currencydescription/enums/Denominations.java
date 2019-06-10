package com.currencydescription.enums;

public enum Denominations {
	ONE(1,"one"),
	TEN(10,"ten"),
	HUNDRED(100, "hundred"),
	THOUSAND(1000,"thousand"),
	MILLION(1000000,"million");
	
	private String description;
	private int numberValue;
	
	Denominations(int numberValue, String description) {
		this.numberValue = numberValue;
		this.description = description;
	}
	
	public String desc() {
		return this.description;
	}
	
	public int getNumberValue() {
		return this.numberValue;
	}
}
