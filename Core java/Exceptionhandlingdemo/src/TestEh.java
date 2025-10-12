class VoterAgeException extends Exception
{

	public String toString()
	{
		return "invalid age!!";
	}

}


class Voter
{
	int age;
	public Voter(int age)
	{
		this.age=age;

	}
	public void validate()
	{
		try
		{
			if(this.age<18)
			{
				throw new VoterAgeException();
			}
			else
			{
				System.out.println("yes you can vote!");
			}
		}
		catch(VoterAgeException ve)
		{
			System.out.println(ve);
		}
	}//validate end here

}//class voter end here

public class TestEh 
{
	public static void main(String[] args)
	{
		Voter v1=new Voter(12);
		v1.validate();
	}
}