package assignment2;

public class CheckGradeForMarks {
	public static void main(String[] args)
	{
		int marks=30;
		if(marks>=75)
		{
			System.out.printf("Distinction");
		}
		else if(marks>=65&&marks<=75)
		{
			System.out.printf("First Class");
		}
		else if(marks>=55&&marks<=65)
		{
			System.out.printf("Second Class");
		}
		else if(marks>=40&&marks>=40)
		{
			System.out.printf("Pass Class");
		}
		else
		{
			System.out.printf("Fail");
		}
	}

}
