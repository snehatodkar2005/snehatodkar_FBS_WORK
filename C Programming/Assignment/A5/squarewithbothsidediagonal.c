void main()
{
	int row=10,col=10;
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=col;j++)
		{
			if(i==1||i==row||j==1||j==col||i==j||i+j==col+1)
				printf("* ");
			else
				printf("  ");
		}
		printf("\n");
	}
}