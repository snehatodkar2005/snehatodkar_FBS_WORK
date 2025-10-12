
public class PrcticeCodeofEH {
	
	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		int c;
		
		try {
			String fname=args[0];
			String lname=args[1];
			System.out.println("name is "+fname+" "+lname);
			c=a/b;
			
			System.out.println("answer is "+c);		
		}
		catch(ArithmeticException ae)
		{
			System.out.println("please dont put second value is 0");
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("please provide at least 2 args from console");
		}
		
	}
}
