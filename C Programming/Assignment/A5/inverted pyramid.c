void main()
{
	int row=5,col;
	for(int i=row;i>=1;i--)
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
}