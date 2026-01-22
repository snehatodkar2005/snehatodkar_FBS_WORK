import java.util.*;

public class DemoOfForEachLoop {

	public static void main1(String[] args) {
		Set <String>s1= new TreeSet<String>();
		System.out.println("ye tree set wala hai ");
		s1.add("Vinayak");
		s1.add("xyz");
		s1.add("abcd");
	
		for(String str:s1)//for every object str inside collection after : is a collection
		{
			
			System.out.println(str.length());

		}
		
	}
	public static void main(String[] args) {

	List <String>l1= new ArrayList<String>();
	l1.add("sneha");
	l1.add("sakshi");
	l1.add("gayatri");
	
	//System.out.println(l1);
	for (int i = 0; i < l1.size(); i++)
	{
		String str=(String)l1.get(i);
		System.out.println(str.length());
	}
	System.out.println("ye array list wala hai ");
	
	for(String str:l1 )
	{
		
		System.out.println(str.length());

	}
	
	
	}

}

