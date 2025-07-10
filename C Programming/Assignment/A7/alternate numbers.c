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
	
	printf("\nalternate numbers in array");
	for(int i=0;i<10;i+=2)
	{
		printf("%d ",arr[i]);
	}
}