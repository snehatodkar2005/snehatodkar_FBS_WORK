void main()
{
	char s[10],reject[10];
	scanf("%s%s",s,reject);
	printf("first reject index=%zu\n",strcspn(s,reject));
}