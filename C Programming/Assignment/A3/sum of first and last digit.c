void main()
{
	int num,rem,sum;
	printf("enter the number");
	scanf("%d",&num);
	int ldigit=num%10;
	while(num>0)
	{
		rem=num%10;
		num=num/10;
	}
	sum=ldigit+rem;
	printf("sum of fisrt digit and last digit is %d",sum);
}