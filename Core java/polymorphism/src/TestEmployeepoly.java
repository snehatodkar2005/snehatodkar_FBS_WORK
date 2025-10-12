class Employee
{
int id;
String name;//reference
double salary;

int getId()
{
return this.id;
}

String getName()
{
return this.name;
}

double getSalary()
{
return this.salary;
}//getter ends here

void setId(int a)
{
this.id=a;
}

void setName(String n)
{
this.name=n;
}

void setSalary(double s)
{
this.salary=s;
}//setter ends here
void display()
{
System.out.println(this.id);
System.out.println(this.name);
System.out.println(this.salary);
}//display function ends here

double calSalary()
{
	return salary;
}

Employee()
{
System.out.println("Default Constructor");
this.id=101;
this.name="sneha";
this.salary=30000;
}//default constructor ends here

Employee(int i,String n,double s)
{
System.out.println("parameterize Constructor");
this.id=i;
this.name=n;
this.salary=s;
}//parameterize constructor ends here
}//class emp ends here

class SalesManager extends Employee
{
	double incentive;
	int target;
	SalesManager() {
		super();
		this.incentive = 230;
		this.target = 20;
	}
	SalesManager(int i, String n, double s, double incentive, int target) {
		super(i, n, s);
		this.incentive = incentive;
		this.target = target;
	}
	double getIncentive() {
		return incentive;
	}
	void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target = target;
	}
	
	void display()
	{
		super.display();
		System.out.println("Incentive is "+this.incentive);
		System.out.println("Traget is "+this.target);
	}
	
	double calSalary()
	{
		return salary+incentive;
	}
}//class salesmanager end here

class SalesArea extends SalesManager
{
	String areaName;

	SalesArea() {
		super();
		this.areaName = "pune";
	}

	SalesArea(int i, String n, double s, double incentive, int target, String areaName) {
		super(i, n, s, incentive, target);
		this.areaName = areaName;
	}

	String getAreaName() {
		return areaName;
	}

	void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	void display()
	{
		super.display();
		System.out.println("Area Name is "+this.areaName);
		
	}
	
}//class salesarea end here

class HR extends Employee
{
	double commission;

	
	
	HR() {
		super();
		this.commission = 890;
	}



	HR(int i, String n, double s, double commission) {
		super(i, n, s);
		this.commission = commission;
	}



	double getCommission() {
		return commission;
	}



	void setCommission(double commission) {
		this.commission = commission;
	}
	
	void display()
	{
		super.display();
		System.out.println("Commission is "+this.commission);
	}
	
	double calSalary()
	{
		return salary+commission;
	}
	
}//class hr end here

class Admin extends Employee

{
	double allownace;

	Admin() {
		super();
		this.allownace = 670;
	}

	Admin(int i, String n, double s, double allownace) {
		super(i, n, s);
		this.allownace = allownace;
	}

	double getAllownace() {
		return allownace;
	}

	void setAllownace(double allownace) {
		this.allownace = allownace;
	}
	
	void display()
	{
		super.display();
		System.out.println("Allownace is"+this.allownace);
	}
	
	double calSalary()
	{
		return salary+allownace;
	}
	
}//class admin end here

class TestEmployee
{
public static void main(String[] args)
{

Employee e2=new Employee(102,"sakshi",35000);
e2.display();
System.out.println(e2.calSalary());


e2=new SalesManager(1,"nagesh",80000,3000,40);//upcasting
e2.display();
System.out.println(e2.calSalary());


e2=new SalesArea(2,"maruti",70000,3456,5,"mumbai");//upcasting
e2.display();


e2=new HR(3,"kavita",70000,450);//upcasting
e2.display();
System.out.println(e2.calSalary());

e2=new Admin(4,"indumati",50000,789);//upcasting
e2.display();
System.out.println(e2.calSalary());


}//main ends here
}//class emptest ends here