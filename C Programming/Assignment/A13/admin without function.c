typedef struct admin
{
	int id;
	char name[20];
	int salary;
	int allowance;
}admin;

void main()
{
	admin adminarr[5];
	
	for(int i=0;i<5;i++)
	{
		printf("enter the %d student deatils",i+1);
		scanf("%d%s%d%d",&adminarr[i].id,&adminarr[i].name,&adminarr[i].salary,&adminarr[i].allowance);
	}
	for(int i=0;i<5;i++)
	{
		printf("\nadmin id=%d\nadmin name=%s\nsalary=%d\nallowance=%d\n\n",adminarr[i].id,adminarr[i].name,adminarr[i].salary,adminarr[i].allowance);
	}
}