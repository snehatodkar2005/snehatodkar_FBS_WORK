class reverseTheNumber
{
public static void main(String[] args)
{
int num=12345678,temp=num,reverse=0;
int rem;
while(num>0)
{
rem=num%10;
num=num/10;
reverse=(reverse*10)+rem;
}
System.out.printf("reverse number is %d",reverse);
}
}