class SumofEvenOddNumber
{
public static void main(String[] args)
{
int SumEven=0;
int SumOdd=0;
int i=1;
while(i<=10)
{
if(i%2==0)
{
SumEven=SumEven+i;
}
else
{
SumOdd=SumOdd+i;
}
i++;
}
System.out.println("Sum of even number ="+SumEven);
System.out.println("Sum of odd number ="+SumOdd);
}
}//main ends here
}//class SumofEvenOddNumber ends here
