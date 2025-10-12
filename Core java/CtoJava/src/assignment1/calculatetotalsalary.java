package assignment1;

public class calculatetotalsalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double basic_salary=2000;
		double da,ta,hra,totalsalary;
		if(basic_salary<=5000)
		{
			da=basic_salary*0.10;
			ta=basic_salary*0.20;
			hra=basic_salary*0.25;
		}
	    else
	    {
	    	da=basic_salary*0.15;
			ta=basic_salary*0.25;
			hra=basic_salary*0.30;
		}
		totalsalary=basic_salary+da+ta+hra;
		System.out.printf("total salary is %f",totalsalary);

	}

}
