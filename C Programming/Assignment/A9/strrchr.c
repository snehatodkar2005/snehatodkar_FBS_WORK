void main()
{
	char s[10],ch;
	scanf("%s %c",s,&ch);
	char *p=strrchr(s,ch);
	if(p)
		printf("found at index %d\n",p-s);
	else
		printf("not found\n");
}
