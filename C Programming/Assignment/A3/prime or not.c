#include<stdio.h>
void main()
{
	int num;
	printf("enter the number");
	scanf("%d",&num);
	int i=2;
	int status=1;
	while(i<=num/2)
	{
		if(num%i==0)
		status=0;
		i++;
	}
	if(status==1)
	{
		printf("number is prime");
	}
	else
	{
		printf("number is not prime");
	}   
}