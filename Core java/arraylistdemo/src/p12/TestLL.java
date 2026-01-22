package p12;


import java.util.LinkedList;


import p11.Employee;

public class TestLL {

	
	public static void main(String[] args)
	{
		LinkedList a1=new LinkedList();
		a1.add(new Employee(101,"sneha",32000));
		a1.add(new Employee(102,"sakshi",42000));
		a1.add(new Employee(103,"gayatri",75000));
		
		System.out.println(a1);
		
	}
	
	
}
