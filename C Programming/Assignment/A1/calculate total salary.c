void main()
{
	double basic_salary=2000;
	double da,ta,hra,total_salary;
	if(total_salary<=5000)
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
	}s
	total_salary=basic_salary+da+ta+hra;
	printf("total salary is %lf",total_salary);
	
}