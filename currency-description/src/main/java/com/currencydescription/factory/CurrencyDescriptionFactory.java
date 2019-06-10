package com.currencydescription.factory;

import com.currencydescription.enums.DescriptionsType;
import com.currencydescription.model.CurrencyDescription;
import com.currencydescription.model.USIntegerCurrencyDescription;

public class CurrencyDescriptionFactory {

	public static CurrencyDescription getCurrencyDesc(DescriptionsType descriptionType) {
		CurrencyDescription currencyDesc;
		switch (descriptionType) {
		case USINTEGER:
			currencyDesc = new USIntegerCurrencyDescription();
			break;
		default:
			currencyDesc = null;
			break;
		}
		return currencyDesc;
	}
}
