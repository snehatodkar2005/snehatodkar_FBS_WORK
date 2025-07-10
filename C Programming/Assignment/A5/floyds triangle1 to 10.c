void main()
{
	int row,col;
	int num=1;
	for(row=1;row<=4;row++)
	{
		for(col=1;col<=row;col++)
		{
			printf("%d ",num);
			num++;
			printf(" ");
		}
		printf("\n");
	}
}