package com.currencydescription.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.currencydescription.enums.DescriptionsType;
import com.currencydescription.exceptions.InvalidNumberToConvert;
import com.currencydescription.factory.CurrencyDescriptionFactory;
import com.currencydescription.model.CurrencyDescription;

public class TestUSIntegerCurrencyDescription {

	@Test
	public void SampleTest0() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("fivty six million and nine hundred and fourty five thousand seven hundred and eighty one",
				currencyDescription.getCurrencyDescription(56945781));
	}

	@Test
	public void SampleTest1() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("one hundred and five", currencyDescription.getCurrencyDescription(105));
	}

	@Test
	public void SampleTest2() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("twenty one", currencyDescription.getCurrencyDescription(21));
	}

	@Test
	public void SampleTest3() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("one", currencyDescription.getCurrencyDescription(1));
	}

	@Test(expected = InvalidNumberToConvert.class)
	public void SampleTest4() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		currencyDescription.getCurrencyDescription(-9);
	}

	@Test(expected = InvalidNumberToConvert.class)
	public void SampleTest5() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		currencyDescription.getCurrencyDescription(1000000000);
	}

	@Test
	public void SampleTest6() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("ninty nine thousand nine hundred and ninty nine",
				currencyDescription.getCurrencyDescription(99999));
	}

	@Test
	public void SampleTest7() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("ninty nine thousand nine hundred and ninty nine",
				currencyDescription.getCurrencyDescription(99999));
	}

	@Test
	public void SampleTest8() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("seventeen million and nine hundred and ninty nine thousand nine hundred and ninty nine",
				currencyDescription.getCurrencyDescription(17999999));
	}

	@Test
	public void SampleTest9() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("seventeen million and nine hundred and ninty nine thousand nine hundred and ninty nine",
				currencyDescription.getCurrencyDescription(17999999));
	}

	@Test
	public void SampleTest10() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("two million and three hundred and seventeen thousand five hundred and twenty three",
				currencyDescription.getCurrencyDescription(2317523));
	}

	@Test
	public void SampleTest11() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("two million and three hundred and seventeen thousand five hundred and twenty three",
				currencyDescription.getCurrencyDescription(2317523));
	}

	@Test
	public void SampleTest12() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("thirty three", currencyDescription.getCurrencyDescription(33));
	}

	@Test
	public void SampleTest13() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("ninty nine", currencyDescription.getCurrencyDescription(99));
	}

	@Test
	public void SampleTest14() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("one hundred and one", currencyDescription.getCurrencyDescription(101));
	}

	@Test
	public void SampleTest15() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("six hundred and five", currencyDescription.getCurrencyDescription(605));
	}

	@Test
	public void SampleTest16() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("seventy seven thousand one hundred and seventy seven",
				currencyDescription.getCurrencyDescription(77177));
	}

	@Test
	public void SampleTest17() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("nine million and nine hundred and twenty three thousand one hundred and fourty one",
				currencyDescription.getCurrencyDescription(9923141));
	}

	@Test
	public void SampleTest18() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals(
				"two hundred and thirty three million and one hundred and fivty four thousand one hundred and twenty three",
				currencyDescription.getCurrencyDescription(233154123));
	}

	@Test
	public void SampleTest19() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("ninteen million and one hundred and ninteen thousand one hundred and thirty four",
				currencyDescription.getCurrencyDescription(19119134));
	}

	@Test
	public void SampleTest20() throws InvalidNumberToConvert {
		CurrencyDescription currencyDescription = CurrencyDescriptionFactory
				.getCurrencyDesc(DescriptionsType.USINTEGER);
		assertEquals("one hundred and fourty three thousand one hundred and twenty five",
				currencyDescription.getCurrencyDescription(143125));
	}
}
