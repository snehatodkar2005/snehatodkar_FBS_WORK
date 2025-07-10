void mystrlen(char*);
void main()
{
	char str[]="helloworld";
	printf("%s",str);
	mystrlen(str);
}
void mystrlen(char* str)
{
	int i=0;
	int count=0;
	while(str[i]!='\0')
	{
		count++;
		i++;
	}
	printf("\nlength of string is %d",count);
}