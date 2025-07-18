//count the number of words in string
#include<stdio.h>
void main()
{
	char str[50];
	printf("enter the string");
	fflush(stdin);
	gets(str);
	int i=0;
	int count=0;
	while(str[i]!='\0')
	{
		if(str[i]==' ')
		count++;
		i++;	
	}
	printf("count is %d",count);
	printf("count of words is %d",count+1);
}