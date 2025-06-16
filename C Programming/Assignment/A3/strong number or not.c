#include<stdio.h>
void main()
{
	int num,rem,sum=0;
	printf("enter the number");
	scanf("%d",&num);
	int org=num;
	while(num>0)
	{
		rem=num%10;
		int fact=1;
		while(rem>1)
		{
			fact=fact*rem;
			rem--;
		}
		sum=sum+fact;
		num=num/10;	
	}
	if(sum==org)
	{
		printf("number is strong");
	}
	else
	{
		printf("number is not strong");
	}
}