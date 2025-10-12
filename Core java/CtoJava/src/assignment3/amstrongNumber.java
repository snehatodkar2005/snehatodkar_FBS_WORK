package assignment3;

public class amstrongNumber {
	public static void main(String[] args)
	{
		int num=153,rem,sum=0;
		int temp=num;
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		num=temp;
		while(temp>0)
		{
			rem=temp%10;
			int res=1,i=1;
			while(i<=count)
			{
				res=res*rem;
				i++;
			}
		sum=sum+res;
		temp=temp/10;
		}
		if(sum==num)
		{
			System.out.printf("number is armstrong");
		}
		else
		{
			System.out.printf("number is not armstrong");
	    }
	}

}
