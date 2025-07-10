void main()
{
	int row=5,col=5;
	for(int i=1;i<=row;i++)
	{
		for(int j=row;j>=i;j--)
		{
			printf("  ");
		}
		for(int j=1;j<=i;j++)
		{
			printf("* ");
		}
		printf("\n");
	}
}