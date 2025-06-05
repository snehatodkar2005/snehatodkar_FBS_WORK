void main()
{
	int a,b,c;
	printf("enter three number\n");
	scanf("%d%d%d",&a,&b,&c);
	printf("a=%d \nb=%d \nc=%d\n\n",a,b,c);
	if(a>b&&a>c)
	{
		printf("a is greater");
	}
	else if(b>a&&b>c)
	{
		printf("b is greater");
	}
	else
	{
		printf("c is greater");
	}
}