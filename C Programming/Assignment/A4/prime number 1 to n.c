#include<stdio.h>
void main()
{
	int j=1;
	while(j<=50)
	{
	int num=j;
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
		printf("%d ",num);
	}
	j++;
}
}