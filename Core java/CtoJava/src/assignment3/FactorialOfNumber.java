package assignment3;

public class FactorialOfNumber {
	public static void main(String[] args)
	{
		int num=5;
		int fact=1,i=1;
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.printf("factorial of given  number is %d",fact);
		
	}

}
