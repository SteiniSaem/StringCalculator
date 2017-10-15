package is.ru.hugb.StringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.Test;

public class StringCalculatorTest {

	StringCalculator calc = new StringCalculator();

	@Test
	public void emptyString()
	{
		assertEquals(0, calc.Add(""));
	}

	@Test
	public void oneSingleDigitNumber()
	{
		assertEquals(1, calc.Add("1"));
		assertEquals(5, calc.Add("5"));
	}

	@Test
	public void twoSingleDigitNumbers()
	{
		assertEquals(3, calc.Add("1,2"));
		assertEquals(12, calc.Add("5,7"));
	}

	@Test
	public void multipleNumbers()
	{
		assertEquals(210, calc.Add("3,91,116"));
		assertEquals(2704, calc.Add("2110,503,91"));
	}

	@Test
	public void withNewLine()
	{
		assertEquals(210, calc.Add("3,91\n116"));
		assertEquals(2704, calc.Add("2110\n503,91"));
	}

	@Test
	public void negativeNumber()
	{
		ExpectedException;
	}

}