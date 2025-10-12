package p2;

import p1.Employee;

public class SalesManager extends Employee {
	
	double incentive;
	int target;
	public SalesManager() {
		super();
		this.incentive = 230;
		this.target = 20;
	}
	public SalesManager(int i, String n, double s, double incentive, int target) {
		super(i, n, s);
		this.incentive = incentive;
		this.target = target;
	}
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Incentive is "+this.incentive);
		System.out.println("Traget is "+this.target);
	}
	public double calSalary()
	{
		return getSalary()+this.incentive;
	}
	

}
