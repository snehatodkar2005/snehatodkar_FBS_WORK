void main()
{
	int units,totalbill=0;
	printf("enter the units");
	scanf("%d",&units);
	if(units>=1&&units<=50)
	{
		printf("per units is 30 Rs");
		totalbill=units*30;
	}
	else if(units>=51&&units<=150)
	{
		printf("per units is 40 Rs");
		totalbill=units*40;
	}
	else if(units>=151)
	{
		printf("per units is 50 Rs");
		totalbill=units*50;
	}
	else
	{
		printf("invalid units");
	}
	printf("\nTotal electricity bill to paid is %d",totalbill);
}