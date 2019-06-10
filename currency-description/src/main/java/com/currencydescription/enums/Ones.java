package com.currencydescription.enums;

public enum Ones {

	ONE(1, "one"), TWO(2, "two"), THREE(3, "three"), FOUR(4, "four"), FIVE(5, "five"), SIX(6, "six"), SEVEN(7,
			"seven"), EIGHT(8, "eight"), NINE(9, "nine");

	private String description;
	private int numberValue;

	Ones(int numberValue, String description) {
		this.numberValue = numberValue;
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}

	public int getNumberValue() {
		return this.numberValue;
	}

}
