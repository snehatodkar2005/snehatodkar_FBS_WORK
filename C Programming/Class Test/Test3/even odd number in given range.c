void main()
{
	int start,end;
	printf("enter the starting value");
	scanf("%d",&start);
	printf("enter the ending value");
	scanf("%d",&end);
	printf("\neven numbers=");
	for(int i=start;i<=end;i++)
	{
		if(i%2==0)
			printf(" %d",i);
	}
	printf("\nodd numbers=");
	for(int i=start;i<=end;i++)
	{
		if(i%2!=0)
		    printf(" %d",i);
	}
}