void main()
{
	int num;
	printf("enter the number\n");
	scanf("%d",&num);
	
	if(num%3==0&&num%5!=0)
	{
		printf("Divisible by 3 but not by 5");
	}
	else if(num%5==0&&num%3!=0)
	{
		printf("Divisible by 5 but not by 3");
	}
	else if(num%3==0&&num%5==0)
	{
		printf("Divisible by both");
	}
	else
	{
		printf("Divisible by none");
	}
}