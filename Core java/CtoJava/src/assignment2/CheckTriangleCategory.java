package assignment2;

public class CheckTriangleCategory {
	public static void main(String[] args)
	{
		int s1=20,s2=20,s3=20;
		if(s1==s2&&s2==s3&&s1==s3)
		{
			System.out.printf("The triangle is equilateral");
		}
		else if(s1==s2||s1==s3||s2==s3)
		{
			System.out.printf("The triangle is isosceles");
		}
		else
		{
			System.out.printf("The triangle is scalene");
		}
	}

}
