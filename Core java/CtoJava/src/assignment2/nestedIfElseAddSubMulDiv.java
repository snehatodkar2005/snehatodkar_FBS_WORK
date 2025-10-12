package assignment2;

public class nestedIfElseAddSubMulDiv {
	
	public static void main(String[] args)
	{
			int no1=20,no2=10;
			int res=0;
			char op='+';
			if(op=='+')
			{
				res=no1+no2;
			}
			else if(op=='-')
			{
				res=no1-no2;
			}
			else if(op=='*')
			{
				res=no1*no2;
			}
			else if(op=='/')
			{
				res=no1/no2;
			}
			else if(op=='%')
			{
				res=no1%no2;
			}
			else
			{
				System.out.printf("invalid choose");
			}
			System.out.printf("\nThe result is %d",res);
			
			
	}

}
