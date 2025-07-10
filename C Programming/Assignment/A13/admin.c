typedef struct admin
{
	int id;
	char name[20];
	int salary;
	int allowance;
}admin;
#include<stdio.h>
void main()
{
	admin a1,a2;
	printf("enter the details of admin1:-\n");
	scanf("%d%s%d%d",&a1.id,&a1.name,&a1.salary,&a1.allowance);
	printf("enter the details of admin2:-\n");
	scanf("%d%s%d%d",&a2.id,&a2.name,&a2.salary,&a2.allowance);
	
	printf("\ndetails of admin 1");
	printf("\nadmin id=%d\nadmin name=%s\nsalary=%d\nallowance=%d",a1.id,a1.name,a1.salary,a1.allowance);
	printf("\n\ndetails of admin 2");
	printf("\nadmin id=%d\nadmin name=%s\nsalary=%d\nallowance=%d",a2.id,a2.name,a2.salary,a2.allowance);
	return ;
}
