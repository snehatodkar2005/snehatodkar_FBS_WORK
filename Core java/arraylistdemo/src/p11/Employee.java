package p11;

import java.util.TreeSet;

public class Employee implements Comparable<Employee>{


	int id;
	String name;//reference
	double salary;

	public int getId()
	{
	return this.id;
	}

	public String getName()
	{
	return this.name;
	}

	public double getSalary()
	{
	return this.salary;
	}//getter ends here

	public void setId(int a)
	{
	this.id=a;
	}

	public void setName(String n)
	{
	this.name=n;
	}

	public void setSalary(double s)
	{
	this.salary=s;
	}//setter ends here
	public void display()
	{
	System.out.println(this.id);
	System.out.println(this.name);
	System.out.println(this.salary);
	}//display function ends here



	public Employee()
	{
	System.out.println("Default Constructor");
	this.id=101;
	this.name="sneha";
	this.salary=30000;
	}//default constructor ends here

	public Employee(int i,String n,double s)
	{
	System.out.println("parameterize Constructor");
	this.id=i;
	this.name=n;
	this.salary=s;
	}//parameterize constructor ends here
	
	public String toString()
	{
		return "\nID : "+this.id +" Name : "+this.name+ " Salary "+this.salary;
				
	}

	public int compareTo(Employee e1) {
		//Employee e2=(Employee) o;//downcasting
		//return this.id-e2.id;
		//return (int) (this.salary-e2.salary); //use int to typeacasting
		return this.name.compareTo(e1.name);
	}

}//class emp ends here

// public class TestEmpCollection {
//		
//		public static void main(String[] args) {
//			
//			TreeSet<Employee> a1=new TreeSet<Employee>();
//			a1.add(new Employee(104,"sneha",32000));
//			a1.add(new Employee(102,"sakshi",42000));
//			a1.add(new Employee(103,"gayatri",75000));
//			
//			System.out.println(a1);
//		}
//
//	}
