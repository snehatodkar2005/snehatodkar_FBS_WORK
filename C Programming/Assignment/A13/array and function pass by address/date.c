typedef struct date
{
	int date;
	int month;
	int year;
}date;
#include<stdio.h>
void store(date* , int );
void display(date* ,int );
void main()
{
	date datearray[10];
	int count;
	printf("how many date you want to add");
	scanf("%d",&count);
	store(datearray,count);
	display(datearray,count);
	
}

void store(date* datearray, int count)
{
	for(int i=0;i<count;i++)
	{
		printf("enter the %d date:- ",i+1);
		scanf("%d%d%d",&datearray[i].date,&datearray[i].month,&datearray[i].year);
	}
}

void display(date* datearray,int count)
{
	for(int i=0;i<count;i++)
	{
		printf("date %d is:- ",i+1);
		printf("\n%d/%d/%d\n",datearray[i].date,datearray[i].month,datearray[i].year);
	}
}

