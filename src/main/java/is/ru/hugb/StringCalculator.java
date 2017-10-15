package is.ru.hugb.StringCalculator;


public class StringCalculator
{
	public static int Add(String numbers)
	{
		if(numbers.length() == 0)
		{
			return 0;
		}
		else
		{
			if(numbers.contains("\n"))
			{
				numbers = numbers.replaceAll("\n", ",");
			}
			int sum = 0;
			String[] array = numbers.split(",");
			for(int i = 0; i < array.length; i++)
			{
				if(Integer.parseInt(array[i]) < 0)
				{
					throw new IllegalArgumentException("Negatives not allowed"); 
				}
				sum += Integer.parseInt(array[i]);
			}
			return sum;
		}
	}
}
