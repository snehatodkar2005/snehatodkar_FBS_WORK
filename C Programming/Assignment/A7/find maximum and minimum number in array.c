void main()
{
	int arr[10];
	int max=arr[0];
	int min;
	printf("enter the elements in array");
	for(int i=0;i<10;i++)
	scanf("%d",&arr[i]);
	printf("elements in array:");
	for(int i=0;i<10;i++)
	printf("%d ",arr[i]);
	for(int i=0;i<10;i++)
	{
		
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	printf("\nmaximum number in array=%d",max);
	min=arr[0];
	for(int i=0;i<10;i++)
	{
		
		if(arr[i]<min)
		{
			min=arr[i];
		}
	}
	printf("\nminimum number in array=%d",min);
}