package assignment3;

public class CheckNumberIsPerfectOrNot {

	public static void main(String[] args)
	{
		int  num=55,sum=0;
		int i=1;
		while(i<num)
		{
			if(num%i==0)
				sum=sum+i;
				i++;
		}
		if(sum==num)
			System.out.printf("number is perfect");
		else
			System.out.printf("number is not perfect");
	}
}
