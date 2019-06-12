package com.currencydescription.model;

import com.currencydescription.enums.Denominations;
import com.currencydescription.enums.ExceptionMessages;
import com.currencydescription.enums.Ones;
import com.currencydescription.enums.Tens;
import com.currencydescription.exceptions.InvalidNumberToConvert;

public abstract class CurrencyDescription {
	
	public abstract String getCurrencyDescription(int amount) throws InvalidNumberToConvert;
	
	public String evaluateMillionsDescription(int num) {
		StringBuilder sb = new StringBuilder("");
		sb.append(evaluateThreeDigitBlock(num));
		sb.append(Denominations.MILLION.desc());

		return sb.toString();

	}

	public String evaluateThousandsDescription(int num) {
		StringBuilder sb = new StringBuilder("");
		sb.append(evaluateThreeDigitBlock(num));
		sb.append(Denominations.THOUSAND.desc());

		return sb.toString();
	}

	public String evaluateThreeDigitBlock(int num) {
		StringBuilder sb = new StringBuilder();
		int factor = num / Denominations.HUNDRED.getNumberValue();
		int remainder = num % Denominations.HUNDRED.getNumberValue();
		if (factor != 0) {
			sb.append(evaluateHundredDescription(factor));
			sb.append(" ");
		}

		if (remainder != 0) {
			sb.append("and ");
			sb.append(evaluateTensDescription(remainder)).append(" ");
		}
		return sb.toString();
	}

	public String evaluateHundredDescription(int num) {
		return new StringBuilder().append(evaluateOnesDescription(num)).append(" ").append(Denominations.HUNDRED.desc())
				.toString();
	}

	public String evaluateTensDescription(int num) {
		StringBuilder sb = new StringBuilder();

		for (Tens con : Tens.values()) {
			if (con.getNumberValue() == num) {
				return sb.append(con.getDescription()).toString();
			}
		}

		int factor = num / Denominations.TEN.getNumberValue();
		int remainder = num % Denominations.TEN.getNumberValue();

		if (factor != 0) {
			for (Tens con : Tens.values()) {
				if (con.getNumberValue() == factor * 10) {
					sb.append(con.getDescription()).toString();
					break;
				}
			}
			sb.append(" ");
		}

		// System.out.println("ones remainder "+remainder);

		if (remainder != 0) {
			sb.append(evaluateOnesDescription(remainder));
		}
		return sb.toString();
	}

	public String evaluateOnesDescription(int num) {
		String result = "";
		for (Ones con : Ones.values()) {
			if (con.getNumberValue() == num) {
				result = con.getDescription();
				break;
			}
		}
		return result;
	}

	public void validateCurrency(int amount) throws InvalidNumberToConvert {
		try {
			if (amount <= 0) {
				throw new InvalidNumberToConvert(ExceptionMessages.SHOULDGREATERTHANZERO.getMessage());
			} else if (amount > 999999999) {
				throw new InvalidNumberToConvert(ExceptionMessages.SHOULDLESSTHANLIMIT.getMessage());
			}
		} catch (Exception e) {
			throw new InvalidNumberToConvert(e.getMessage());
		}
	}
}
