package p2;

import p1.Employee;

public class HR extends Employee {
double commission;

	
	
	public HR() {
		super();
		this.commission = 890;
	}



	public HR(int i, String n, double s, double commission) {
		super(i, n, s);
		this.commission = commission;
	}



	public double getCommission() {
		return commission;
	}



	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Commission is "+this.commission);
	}
	
	public double calSalary()
	{
		return getSalary()+this.commission;
	}
	
}
