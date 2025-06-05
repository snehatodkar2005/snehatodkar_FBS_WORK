#include<stdio.h>
void main()
{
	int no1,no2,res;
	char op;
	printf("enter '+' for addtion \nenter '-' for substraction \nenter '*' for multiplication' \nenter '/' for division \nenter '%%' for module\n");
	scanf("%c",&op);
	printf("enter two number\n");
	scanf("%d%d",&no1,&no2);
	
	if(op=='+')
	{
		res=no1+no2;
	}
	else if(op=='-')
	{
		res=no1-no2;
	}
	else if(op=='*')
	{
		res=no1*no2;
	}
	else if(op=='/')
	{
		res=no1/no2;
	}
	else if(op=='%')
	{
		res=no1%no2;
	}
	else
	{
		printf("invalid choose");
	}
	printf("\nThe result is %d",res);
	
	
}