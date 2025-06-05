void main()

{
	int age;
	printf("enter the age\n");
	scanf("%d",&age);
	if(age<12)
	{
		printf("Child");
	}
	else if(age>=12&&age<=19)
	{
		printf("Teenager");
	}
	else if(age>=20&&age<=59)
	{
		printf("Adult");
	}
	else
	{
		printf("Senior");
	}
}