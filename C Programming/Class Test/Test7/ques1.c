//swap the array element by position
void main()
{
	int arr[8];
	printf("enter element in array");
	store(arr,8);
	printf("element in array [");
	display(arr,8);
	printf("\b\b]");
	int p1,p2;
	printf("\nenter the two postion two swap");
	scanf("%d%d",&p1,&p2);
	swapbyposition(arr,8,p1,p2);
	printf("\nafter swap [");
	display(arr,8);
	printf("\b\b]");
}
void store(int* arr,int size)
{
	for(int i=0;i<size;i++)
	{
		scanf("%d",&arr[i]);
	}
}
void display(int* arr,int size)
{
	for(int i=0;i<size;i++)
	{
		printf("%d, ",arr[i]);
	}
}
void swapbyposition(int* arr,int size,int p1,int p2)
{
	int i1=p1-1,i2=p2-1;
	int temp=arr[i1];
	arr[i1]=arr[i2];
	arr[i2]=temp;
}