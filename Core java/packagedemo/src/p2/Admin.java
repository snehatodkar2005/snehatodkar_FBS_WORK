package p2;

import p1.Employee;

public class Admin extends Employee {
	
	double allownace;

	public Admin() {
		super();
		this.allownace = 670;
	}

	public Admin(int i, String n, double s, double allownace) {
		super(i, n, s);
		this.allownace = allownace;
	}

	public double getAllownace() {
		return allownace;
	}

	public void setAllownace(double allownace) {
		this.allownace = allownace;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Allownace is"+this.allownace);
	}
	
	public double calSalary()
	{
		return getSalary()+this.allownace;
	}

}
