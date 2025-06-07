#include<stdio.h>
void main()
{
	double price,totalprice;
	char isstudent;
	double discount;
	printf("engter the price\n");
	scanf("%lf",&price);
	printf("enter is a student or not\n");
	fflush(stdin);
	scanf("%c",&isstudent);
	if(isstudent=='y')
	{
		if(price>500)
		{
			discount=price*0.20;
			totalprice=price-discount;		
		}
		else
		{
			discount=price*0.10;
			totalprice=price-discount;
		}
	}
	else
	{
		if(isstudent=='n')
		{
		if(price>600)
		{
			discount=price*0.15;
			totalprice=price-discount;
		}
		else
		{
			totalprice=price;
		}
	    }
	}
	printf("Total price=%lf",totalprice);
}