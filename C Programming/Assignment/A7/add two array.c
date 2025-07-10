void main()
{
	int s1=10,s2=5;
	int arr[s1];
	int brr[s2];
	int s3=s1>s2?s1:s2;
	int min=s1<s2?s1:s2;
	int crr[s3];
	printf("enter the element of arr");
	for(int i=0;i<s1;i++)
		scanf("%d",&arr[i]);
		
	printf("elements in array arr");
	printf("[");
	for(int i=0;i<s1;i++)
		printf("%d, ",arr[i]);
	printf("\b\b]");
	
	printf("\nenter the element of brr");
	for(int i=0;i<s2;i++)
		scanf("%d",&brr[i]);
		
	printf("\nelements in array brr");
	printf("[");
	for(int i=0;i<s2;i++)
		printf("%d, ",brr[i]);
	printf("\b\b]");
	
	
	for(int i=0;i<min;i++)
	{
		crr[i]=arr[i]+brr[i];
	}
	
	for(int i=min;i<s3;i++)
	{
		if(s1>s2)
			crr[i]=arr[i];
		else
		crr[i]=brr[i];
		
	}
	
	printf("\nsum of two array");
	printf("[");
	for(int i=0;i<s3;i++)
	{
		printf("%d ,",crr[i]);
	}
	printf("\b\b]");
}