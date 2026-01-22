package p12;

import java.util.ArrayList;

import p11.Employee;

public class TestAL {
	
	public static void main(String[] args)
	{
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(new Employee(101,"sneha",30000));
		a1.add(new Employee(102,"sakshi",12000));
		a1.add(new Employee(103,"gayatri",35000));
		
		System.out.println(a1);
		
	}
	
	
}
