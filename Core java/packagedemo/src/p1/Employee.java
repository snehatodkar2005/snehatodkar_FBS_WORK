package p1;

public class Employee {

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
	public double calSalary()
	{
		return salary;
	}
	
	
}//class emp ends here

