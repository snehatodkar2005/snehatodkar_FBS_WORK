void main()
{
	int start,end;
	int sum=0;
	printf("enter the start and end value for sum");
	scanf("%d%d",&start,&end);
	int i=start;
	while(i<=end)
	{
		sum=sum+i;
		i++;
	}
	printf("sum of given range is %d",sum);
	
}
