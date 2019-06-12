package com.currencydescription.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.currencydescription.enums.DescriptionsType;
import com.currencydescription.exceptions.InvalidNumberToConvert;
import com.currencydescription.factory.CurrencyDescriptionFactory;
import com.currencydescription.model.CurrencyDescription;

public class TestUSIntegerCurrencyDescription {

	@Test
	public void testForMillion56945781() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("fivty six million and nine hundred and fourty five thousand seven hundred and eighty one",
				currencyDescription.getCurrencyDescription(56945781));
	}

	@Test
	public void testForHundreds105() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("one hundred and five", currencyDescription.getCurrencyDescription(105));
	}

	@Test
	public void testForTens21() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("twenty one", currencyDescription.getCurrencyDescription(21));
	}

	@Test
	public void testForOnes1() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("one", currencyDescription.getCurrencyDescription(1));
	}

	@Test(expected = InvalidNumberToConvert.class)
	public void testNegetiveForNegetiveNumbers() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		currencyDescription.getCurrencyDescription(-9);
	}

	@Test(expected = InvalidNumberToConvert.class)
	public void testNegetiveForUpperBound() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		currencyDescription.getCurrencyDescription(1000000000);
	}

	@Test
	public void testForThousands99999() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("ninty nine thousand nine hundred and ninty nine",
				currencyDescription.getCurrencyDescription(99999));
	}

	@Test
	public void testForMillion17999999() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("seventeen million and nine hundred and ninty nine thousand nine hundred and ninty nine",
				currencyDescription.getCurrencyDescription(17999999));
	}

	@Test
	public void testForMillion2317523() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("two million and three hundred and seventeen thousand five hundred and twenty three",
				currencyDescription.getCurrencyDescription(2317523));
	}

	@Test
	public void testForTens33() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("thirty three", currencyDescription.getCurrencyDescription(33));
	}

	@Test
	public void testForTens99() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("ninty nine", currencyDescription.getCurrencyDescription(99));
	}

	@Test
	public void testForHundreds101() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("one hundred and one", currencyDescription.getCurrencyDescription(101));
	}

	@Test
	public void testForHundreds605() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("six hundred and five", currencyDescription.getCurrencyDescription(605));
	}

	@Test
	public void testForThousands77177() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("seventy seven thousand one hundred and seventy seven",
				currencyDescription.getCurrencyDescription(77177));
	}

	@Test
	public void testForMillions9923141() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("nine million and nine hundred and twenty three thousand one hundred and fourty one",
				currencyDescription.getCurrencyDescription(9923141));
	}

	@Test
	public void testForMillions233154123() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals(
				"two hundred and thirty three million and one hundred and fivty four thousand one hundred and twenty three",
				currencyDescription.getCurrencyDescription(233154123));
	}

	@Test
	public void testForThousands143125() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("one hundred and fourty three thousand one hundred and twenty five",
				currencyDescription.getCurrencyDescription(143125));
	}
}
