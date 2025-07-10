void main()
{
	int arr[5];
	int num,found=0;
	printf("enter the array element");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("elements in array is :");
	for(int i=0;i<5;i++)
	{
		printf("%d ",arr[i]);
	}
	
	printf("\nenter the number to found");
	scanf("%d",&num);
	int i;
	for(i=0;i<5;i++)
	{
		if(arr[i]==num)
		{
			printf("\nnumber %d found at index %d",num,i);
			found=1;
		}
	}
	if(found==0)
		printf("\n%d number not found in this array",num);
		
	
	
}