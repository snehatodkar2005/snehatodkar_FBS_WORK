void main()
{
	int arr[5]={1,2,3,4,5};
	int sum=0;
	printf("elements in array is:");
	for(int i=0;i<5;i++)
	{
		printf("%d ",arr[i]);
		sum=sum+arr[i];
	}
	printf("\nsum of all elements in array is %d",sum);
	
}