typedef struct complex
{
	int real;
	int imaginary;
}complex;
void store(complex*,int);
void display(complex*,int);
void main()
{
	complex comarray[5];
	int count;
	printf("how many complex number you want to add");
	scanf("%d",&count);
	store(comarray,count);
	display(comarray,count);
}
void store(complex* comarray,int count)
{
	for(int i=0;i<count;i++)
	{
		printf("enter the %d complex number",i+1);
		scanf("%d%d",&comarray[i].real,&comarray[i].imaginary);
	}
}
void display(complex* comarray,int count)
{
	for(int i=0;i<count;i++)
	{
		printf("%d complex number is:- ",i+1);
		printf("%d + %di\n",comarray[i].real,comarray[i].imaginary);
    }
}


