void main()
{
	char s[10],accept[10];
	scanf("%s%s",s,accept);
	char *p=strpbrk(s,accept);
	if(p)
		printf("first match :%c\n",*p);
	else
		printf("no match found");
}