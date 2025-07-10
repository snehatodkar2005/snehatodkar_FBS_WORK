void main()
{
	int arr[5]={11,22,33,44,55};
	printf("enter the elements");
	storeanddisplay(arr,5);
	reversearray(arr,5);
}

void storeanddisplay(int* arr,int size)
{
	for(int i=0;i<size;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("\nelements in array:");
	for(int i=0;i<size;i++)
	{
		printf("%d ",arr[i]);
	}
}
void reversearray(int* arr,int size)
{

	printf("\nreverse array ");
	for(int i=size-1;i>=0;i--)
	{
		arr[i]=arr[i];
		printf("%d ",arr[i]);
	}
}