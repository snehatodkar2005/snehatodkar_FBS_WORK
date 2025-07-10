void main() {
    int arr[10];
    printf("Enter elements in array:\n");
    for(int i=0;i<10;i++)
	{
        scanf("%d",&arr[i]);
    }
    
    printf("Elements in array: ");
    for(int i=0;i<10;i++)
	{
        printf("%d ",arr[i]);
    }
    
    printf("\nPrime numbers in array: ");
    for(int i=0;i<10;i++) 
	{
        int num=arr[i];
        int isPrime=1;
        if(num<2)
            isPrime=0;
        else {
            for(int j=2;j<=num/2;j++)
			{
                if(num%j==0)
				{
                    isPrime=0;
                    break;
                }
           }
        }

        if(isPrime==1)
            printf("%d ",num);
    }

}
