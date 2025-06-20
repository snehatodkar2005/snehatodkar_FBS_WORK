int sumofalternatenumber(int ,int );
void main()
{
	int start,end;
	printf("enter the starting value");
	scanf("%d",&start);
	printf("enter the ending value");
	scanf("%d",&end);
	int sum=sumofalternatenumber(start,end);
	printf("sum of alternate numbers is %d",sum);
}
int sumofalternatenumber(int start,int end)
{
	int sum=0;
	for(int i=start;i<=end;i+=2)
	{
		sum=sum+i;
	}
	return sum;
}