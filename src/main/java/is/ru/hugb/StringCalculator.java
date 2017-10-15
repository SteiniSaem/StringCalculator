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
			int sum = 0;
			String[] array = numbers.split(",");
			for(int i = 0; i < array.length; i++)
			{
				sum += Integer.parseInt(array[i]);
			}
			return sum;
		}

	public static void main(String[] args) {

		System.out.println(Add("3,91,116"));
	}
}