void main()
{
	int row=5,col;
	for(int i=1;i<=row;i++)
	{
		for(int j=row;j>=i;j--)
		{
			printf(" ");
		}
		for(int j=1;j<=i;j++)
		{
			printf("* ");
		}
		printf("\n");
	}
	for(int i=row;i>=1;i--)
	{
		for(int j=row;j>=i;j--)
		{
			printf(" ");
		}
		for(int j=1;j<=i-1;j++)
		{
			printf(" *");
		}
		printf("\n");
	}
}