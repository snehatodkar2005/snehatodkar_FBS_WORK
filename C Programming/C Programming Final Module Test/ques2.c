//print following series 1+11+111;
void main()
{
	int count;
	long long int number;
	printf("enter the count");
	scanf("%d",&count);
	printf("enter the number you want to print");
	scanf("%lld",&number);
	for(int i=1;i<=count;i++)
	{
		for(int j=1;j<=i;j++)
		{
		printf("%lld",number);
		}
		printf("+");
	}
}