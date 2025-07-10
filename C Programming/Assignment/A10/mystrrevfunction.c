void main()
{
	char str[10]="firstbit";
	char rev[10];
	printf("original string %s",str);
	mystrrev(rev);
}
void mystrrev(char* rev)
{
	for(int i=8;i<0;i--)
	{
		rev[i]=str[i];
	}
	printf("\nreverse string is %s",rev);
}