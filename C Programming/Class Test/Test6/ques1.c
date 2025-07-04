//find common elment in two array
#include<stdio.h>
void store(int* ,int );
void display(int* ,int );
void commomelementinarray(int* ,int* ,int );
void main()
{
	int arr[5],brr[5];
	printf("enter the array element");
	store(arr,5);
	printf("element in array arr ");
	display(arr,5);
	printf("\nenter the array element in brr");
	store(brr,5);
	printf("\nelement in array brr ");
	display(brr,5);
	printf("\ncommon element ");
	commomelementinarray(arr,brr,5);
	
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
		printf("%d ",arr[i]);
	}
}
	
void commomelementinarray(int* arr,int* brr,int size)
{
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(arr[i]==brr[j])
				printf("%d ",arr[i]);
		}
	}
}
