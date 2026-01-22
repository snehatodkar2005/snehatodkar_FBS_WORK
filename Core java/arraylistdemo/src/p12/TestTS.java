package p12;


import java.util.TreeSet;

import p11.Employee;
public class TestTS {
	
	public static void main(String[] args) {
		
		TreeSet<Employee> a1=new TreeSet<Employee>();
		a1.add(new Employee(104,"sneha",32000));
		a1.add(new Employee(102,"sakshi",42000));
		a1.add(new Employee(103,"gayatri",75000));
		
		System.out.println(a1);
	}

}
