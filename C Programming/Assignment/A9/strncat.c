void main()
{
	char dest[10],src[10];
	printf("string 1 and 2 is :");
	scanf("%s%s",dest,src);
	strncat(dest,src,4);
	printf("result is %s",dest);
}