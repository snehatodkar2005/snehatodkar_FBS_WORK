void main()
{
	int num,res;
	printf("enter the number");
	scanf("%d",&num);
	int i=1;
	while(i<=10)
	{
		res=num*i;
		printf("%d*%d=%d\n",num,i,res);
		i++;
	}
}