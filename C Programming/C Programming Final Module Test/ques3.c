//menu driven code to add and display song detils 
typedef struct song
{
	int songid;
	char title[20],artist[20];
	int duration;
}song;
#include<stdio.h>
void main()
{
	song songarr[10];
	int ci=0;
	int choice,exit;
	do{
		printf("enter 1 to store the song detils\nenter 2 to display the song detils");
		scanf("%d",&choice);
		if(choice==1)
		{
			int size;
			printf("how many song detils you want to add");
			scanf("%d",&size);
			store(songarr,&ci,size);
		}
		else if(choice==2)
		{
			display(songarr,ci);
		}
		else
		{
			printf("invalid choice");
		}
		printf("\ndo you wnat to continue(enter 1 to continue 0 to end the program)");
		scanf("%d",&exit);
	}while(exit==1);
	printf("program end");
	
}
void store(song* arr,int* ci,int size)
{
	for(int i=0;i<size;i++)
	{
		printf("enter the %d song deatils",i+1);
		printf("\nsong id:-");
		scanf("%d",&arr[*ci].songid);
		printf("song title:-");
		fflush(stdin);
		gets(arr[*ci].title);
		printf("song artist:-");
		fflush(stdin);
		gets(arr[*ci].artist);
		printf("song duration;-");
		scanf("%d",&arr[*ci].duration);
		(*ci)++;
}
}
void display(song* arr,int size)
{
	
	printf("\n%-5s %-15s %-30s %-20s %-20s\n","Sr.no","song ID", "Song title", "Artist", "Duration");
    printf("----------------------------------------------------------------------------------------------------\n");
    for (int i=0;i<size;i++)
    {
        printf("%-5d %-15d %-30s %-20s %-20d \n",i+1,arr[i].songid,arr[i].title,arr[i].artist,arr[i].duration);
    }                     
}