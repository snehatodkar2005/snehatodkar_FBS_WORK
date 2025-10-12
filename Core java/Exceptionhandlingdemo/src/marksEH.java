class MarksInvalid extends Exception
{
	public String toString()
	{
		return "Marks Invalid";
	}
}
class marks{
	int marks;
	public marks(int marks)
	{
		this.marks=marks;
	}
	public void mark() throws MarksInvalid
	{
		if(this.marks<18)
		{
			throw new MarksInvalid();
		}
	    if(marks>=75)
	    	System.out.println("Distinction");	
	    	 else if(marks>=65)
	    		 System.out.println("First Class");
	         else if(marks>=55)
	        	 System.out.println("Second Class");
	         else if(marks>=40)
	        	 System.out.println("pass");
	         else
	        	 System.out.println("fail");
	}
		
}
	
	
public class marksEH{
	public static void main(String[]args)
	{
		marks m1=new marks(-1);
		try
		{
		
	    m1.mark();
		
	}
		catch(MarksInvalid m)
	{
		System.out.println(m);
	}
	}
}