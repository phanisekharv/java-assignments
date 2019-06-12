package com.currencydescription.model;

import com.currencydescription.enums.Denominations;
import com.currencydescription.exceptions.InvalidNumberToConvert;

public class USIntegerCurrencyDescription extends CurrencyDescription {
	
	@Override
	public String getCurrencyDescription(int amount) throws InvalidNumberToConvert {
		validateCurrency(amount);
		StringBuilder sb = new StringBuilder("");
		
		int factor = amount/Denominations.MILLION.getNumberValue();
		int  remainder = amount%Denominations.MILLION.getNumberValue();
		
		//System.out.println("million factor "+factor+" remainder "+remainder);
		
		if (factor != 0) {
			sb.append(evaluateMillionsDescription(factor));
			sb.append(" ");
		}
		
		if (remainder != 0) {
			sb.append("and ");
		}
		
		factor = remainder/Denominations.THOUSAND.getNumberValue();
		remainder = remainder%Denominations.THOUSAND.getNumberValue();
		//System.out.println("thousand factor "+factor+" remainder "+remainder);
		if (factor != 0) {
			sb.append(evaluateThousandsDescription(factor));
			sb.append(" ");
		}
		
		sb.append(evaluateThreeDigitBlock(remainder));
		
		return sb.toString().replaceAll("^(and.)*", "").trim();
	}

}
