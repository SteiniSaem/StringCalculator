package is.ru.StringCalculator

import static org.junit.Assert.assertEquals;

import org.junit.Test

public class StringCalculatorTest {

	@Test
	public void emptyString()
	{
		assertEquals(0, StringCalculator.Add(""));
	}

	@Test
	public void oneSingleDigitNumber()
	{
		assertEquals(1, StringCalculator.Add("1"));
		assertEquals(5, StringCalculator.Add("5"));
	}

}