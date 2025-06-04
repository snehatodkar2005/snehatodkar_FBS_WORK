void main()
{
	int year=2001;
	if(year%4==0&&year%100!=0||year%400==0)
	{
		printf("the given year %d is leap year",year);
	}
	else
	{
		printf("the given year %d is not leap year",year);
	}
}