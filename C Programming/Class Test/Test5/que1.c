void main()
{
	double costprice,sellingprice;
	printf("enter the cost price");
	scanf("%lf",&costprice);
	
	if(costprice>=500&&costprice<=1000)
	{
		double discount;
		discount=costprice*0.10;
		sellingprice=costprice-discount;
	}
	else if(costprice>=1001 && costprice<=2000)
	{
		double discount;
		discount=costprice*0.15;
		sellingprice=costprice-discount;
	}
	else if(costprice>=2001 && costprice<=5000)
	{
		double discount;
		discount=costprice*0.20;
		sellingprice=costprice-discount;
	}
	else if(costprice<500)
	{
		sellingprice=costprice;
	}
	else
	{
		printf("invalid choose");
	}
	printf("selling is of book is %lf",sellingprice);
}