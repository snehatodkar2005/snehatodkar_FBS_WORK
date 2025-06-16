void main()
{
	int num,temp,rem,reverse;
	printf("enter the number");
	scanf("%d",&num);
	temp=num;
	while(num>0)
	{
		rem=num%10;
		num=num/10;
		reverse=(reverse*10)+rem;
	}
	if(temp==reverse)
	{
		printf("number is palindrome");
	}
	else
	{
		printf("number is not palindrome");
	}
}