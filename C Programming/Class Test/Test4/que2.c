//calculate power of number
void main()
{
	int base,exp,res=1;
	printf("enter the number and exponent");
	scanf("%d%d",&base,&exp);
	for(int i=1;i<=exp;i++)
	{
		res=res*base;
	}
	printf("%d^%d=%d",base,exp,res);
	
}