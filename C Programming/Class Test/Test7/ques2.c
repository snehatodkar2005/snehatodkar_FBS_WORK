//check the array is plaindrome or not
void main()
{
	int arr[6];
	printf("enter element in array");
	store(arr,6);
	printf("element in array [");
	display(arr,6);
	printf("\b\b]");
	int ispailandrome=ArrIsPaindromeOrNot(arr,6);
	if(ispailandrome)
	{
		printf("\narray is palindome");
		
	}
	else
		printf("\narray is not palindrome");
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
void ArrIsPaindromeOrNot(int* arr,int size)
{
	for(int i=0;i<size;i++)
	{
		if(arr[i]==arr[size-1])
		{
			return 1;
		}
		return 0;
	}
}