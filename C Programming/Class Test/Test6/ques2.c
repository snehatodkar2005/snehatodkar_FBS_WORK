//find two maximum number in array
void main()
{
	int arr[5];
	printf("enter the element");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("\nelement in array");
	for(int i=0;i<5;i++)
	{
		printf("%d ",arr[i]);
	}
	int max=arr[0];
	for(int i=0;i<5;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	printf("\n\nfirst maximum number in array %d ",max);
	int max2=arr[0];
	for(int i=0;i<5;i++)
	{
		if(arr[i]>max2 && arr[i]!=max)
		{
			max2=arr[i];
		}
	}
	printf("\nsecond maximum number in array %d",max2);
}