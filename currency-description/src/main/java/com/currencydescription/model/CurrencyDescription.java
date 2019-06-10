package com.currencydescription.model;

import com.currencydescription.exceptions.InvalidNumberToConvert;

public abstract class CurrencyDescription {
	
	public abstract String getCurrencyDescription(int amount) throws InvalidNumberToConvert;
	
}
