void main()
{
	int year;
	printf("enter the year\n");
	scanf("%d",&year);
	if(year%4==0&&year%100!=0||year%400==0)
	{
		printf("The year is leap");
	}
	else
	{
		printf("the year is not leap");
	}
}