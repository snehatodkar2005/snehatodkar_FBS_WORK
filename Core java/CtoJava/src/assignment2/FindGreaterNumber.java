package assignment2;

public class FindGreaterNumber {
	public static void main(String[] args)
	{
		int a=10,b=100,c=10;
		System.out.printf("a=%d \nb=%d \nc=%d\n\n",a,b,c);
		if(a>b&&a>c)
		{
			System.out.printf("a is greater");
		}
		else if(b>a&&b>c)
		{
			System.out.printf("b is greater");
		}
		else
		{
			System.out.printf("c is greater");
		}
	}

}
