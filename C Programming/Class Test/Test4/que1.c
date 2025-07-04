//find the factors of the given range
#include<stdio.h>
void main()
{
	int start,end,i,j;
	printf("enter the starting value");
	scanf("%d",&start);
	printf("enter the end value");
	scanf("%d",&end);
	
	for(i=start;i<=end;i++)
	{
		printf("\n%d=",i);
		for(j=1;j<=end;j++)
		{
			if(i%j==0)
				printf("%d,",j);
		}
	}
}