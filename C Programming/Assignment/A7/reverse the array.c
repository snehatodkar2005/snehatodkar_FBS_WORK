void main()
{
	int arr[5]={11,22,33,44,55};
	int rev[5];
	printf("elements in arr ");
	for(int i=0;i<5;i++)
		printf("%d ",arr[i]);
	
	printf("\nreverse array ");
	for(int i=4;i>=0;i--)
	{
		rev[i]=arr[i];
		printf("%d ",rev[i]);
	}
}