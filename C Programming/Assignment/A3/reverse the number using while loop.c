void main()
{
	int num;
	int temp,rem,reverse;
		temp=num;
		printf("enter the number");
		scanf("%d",&num);
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			reverse=(reverse*10)+rem;
		}
		printf("reverse number=%d",reverse);
}