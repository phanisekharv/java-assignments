package com.currencydescription.tests;

import com.currencydescription.enums.DescriptionsType;
import com.currencydescription.exceptions.InvalidNumberToConvert;
import com.currencydescription.factory.CurrencyDescriptionFactory;
import com.currencydescription.model.CurrencyDescription;

public class USIntegerCurrencyDescriptionMain {
	public static void main(String[] args) throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory.getCurrencyDesc(DescriptionsType.USINTEGER);
		
		System.out.println(currencyDescription.getCurrencyDescription(143125));
	}
}
