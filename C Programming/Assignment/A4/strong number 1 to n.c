#include<stdio.h>
void main()
{
	int j=1;
	while(j<=50000)
	{
	int num=j,rem,sum=0;
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
		printf("%d ",org);
	}
	j++;
}

}