void main()
{
	char str1[20]="sneha@todkar";
	char str2[20];
	printf("string is %s",str1);
	mystrcpy(str1,str2);
}
void mystrcpy(char* str1,char* str2)
{
	int i=0;
	while(str1[i]!='\0')
	{
		str2[i]=str1[i];
		i++;
	}
	str2[i]='\0';
	printf("\ncopied string str2 is %s",str2);
}