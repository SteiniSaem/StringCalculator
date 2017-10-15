package is.ru.hugb.StringCalculator;

import java.util.Arrays;


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
			int[] negatives = new int[array.length];
			int count = 0;
			for(int i = 0; i < array.length; i++)
			{
				int n = Integer.parseInt(array[i]);
				if(n < 0)
				{
					negatives[count] = n;
					count++;
				}
				sum += n;
			}
			if(count != 0)
			{
				int[] negatives2 = new int[count];
				int i = 0;
				while(negatives[i] != 0)
				{
					negatives2[i] = negatives[i];
					i++;
				}
				throw new IllegalArgumentException("Negatives not allowed: " + Arrays.toString(negatives2).replaceAll("\\[|\\]|\\s", "")); 
			}
			return sum;
		}
	}
	
}
