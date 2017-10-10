package is.ru.hugb.StringCalculator;


public class StringCalculator
{
	public static int Add(String numbers)
	{
		if(numbers.length() == 0)
		{
			return 0;
		}
		
		if(numbers.length() == 1)
		{
			char a = numbers.charAt(0);
			int num = Character.getNumericValue(a);
			return num;
		}
		if(numbers.length() == 2)
		{
			char a = numbers.charAt(0);
			int num1 = Character.getNumericValue(a);
			char b = numbers.charAt(2);
			int num2 = Character.getNumericValue(b);
			return num1 + num2;
		}
	}
	
	public static void main(String[] args) {

	}
}