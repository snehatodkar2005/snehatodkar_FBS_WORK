#include<stdio.h>
void main()
{
	int num,rem,temp,sum=0;
	printf("enter the number");
	scanf("%d",&num);
	temp=num;
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
		printf("number is armstrong");
	}
	else
	{
		printf("number is not armstrong");
    }
}