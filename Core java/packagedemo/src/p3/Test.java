package p3;

import p1.Employee;
import p2.Admin;
import p2.HR;
import p2.SalesManager;

abstract public class Test {
	
	public static void main(String[] args) {

		Employee[] Err = new Employee[3];
		Err[0]=new SalesManager();
		Err[1]=new Admin();
		Err[2]=new HR();
		
		for(int i=0;i<Err.length;i++)
		{
			Err[i].display();
		}
		
		
	}
		

}

