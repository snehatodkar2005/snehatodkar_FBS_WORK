package assignment2;

public class CalculateTotalPriceNestedIfElse {

	public static void main(String[] args) {
		double price=500,totalprice=0;
		char isstudent='n';
		double discount;
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
		System.out.printf("Total price=%f",totalprice);

	}

}
