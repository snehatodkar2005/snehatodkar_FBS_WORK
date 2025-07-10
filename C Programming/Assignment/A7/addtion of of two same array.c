void main()
{
	int arr[5];
	int brr[5];
	int crr[5];
	printf("enter the element of arr");
	for(int i=0;i<5;i++)
		scanf("%d",&arr[i]);
		
	printf("elements in array arr");
	printf("[");
	for(int i=0;i<5;i++)
		printf("%d, ",arr[i]);
	printf("\b\b]");
	
	printf("\nenter the element of brr");
	for(int i=0;i<5;i++)
		scanf("%d",&brr[i]);
		
	printf("\nelements in array brr");
	printf("[");
	for(int i=0;i<5;i++)
		printf("%d, ",brr[i]);
	printf("\b\b]");
	
	
	for(int i=0;i<5;i++)
	{
		crr[i]=arr[i]+brr[i];
	}
	printf("\naddtion of two array:");sss
	printf("[");
	for(int i=0;i<5;i++)
	{
		printf("%d, ",crr[i]);
	}
		printf("\b\b]");
}