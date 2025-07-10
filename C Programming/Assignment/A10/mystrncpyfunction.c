char mystrncpy(char* ,char* ,int);
void main()
{
	char str1[20]="sneha@todkar";
	char str2[20];
	printf("string is %s",str1);
	mystrncpy(str1,str2,5);
	printf("\ncopied string str2 is %s",str2);
}
char mystrncpy(char* str1,char* str2,int size)
{
	int i=0;
	while(i<size&&str1[i]!='\0')
	{
		str2[i]=str1[i];
		i++;
	}
	str2[i]='\0';
	return str2;
}