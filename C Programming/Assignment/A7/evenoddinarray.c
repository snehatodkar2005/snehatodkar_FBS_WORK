void main()
{
	int arr[10];
	printf("enter the elements");
	for(int i=0;i<10;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("elements in array:");
	for(int i=0;i<10;i++)
	{
		printf("%d ",arr[i]);
	}
	
	printf("\neven numbesr in array: ");
	for(int i=0;i<10;i++)
	{
		if(arr[i]%2==0)
			printf("%d ",arr[i]);
	}
	
	printf("\nodd numbers in array: ");
	for(int i=0;i<10;i++)
	{
		if(arr[i]%2!=0)
			printf("%d ",arr[i]);
	}
}