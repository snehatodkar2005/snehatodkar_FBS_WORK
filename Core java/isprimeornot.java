class primeNumberInRange
{
public static void main(String[] args)
{
int num=5;
int status=1;
int i=2;
while(i<=num/2)
{
if(num%i==0)
status=0;
i++;
}
if(status==1)
{
System.out.println("number is prime");
}
else
{
System.out.println("number is not prime");
}
}//main ends here
}//class primeNumberInrange here