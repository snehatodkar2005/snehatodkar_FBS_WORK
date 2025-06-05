#include<stdio.h>
void main()
{
	int s1,s2,s3;
	printf("enter the three sides of triangle\n");
	scanf("%d%d%d",&s1,&s2,&s3);
	if(s1==s2&&s2==s3&&s1==s3)
	{
		printf("The triangle is equilateral");
	}
	else if(s1==s2||s1==s3||s2==s3)
	{
		printf("The triangle is isosceles");
	}
	else
	{
		printf("The triangle is scalene");
	}
}