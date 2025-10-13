package controller;

import java.util.ArrayList;

import model.Admin;
import model.Employee;
import model.HR;
import model.SalesManager;

public class EmployeeDAO {
	
	
	static ArrayList<Employee> employees=new ArrayList<Employee>();
	static {
		
		employees.add( new HR(101, "sneha", 40000, 4000));
		employees.add( new HR(102, "sakshi", 58000, 3700));
		employees.add( new HR(103, "gayatri", 87000, 5000));
		employees.add( new SalesManager(201, "sanika", 62000, 120, 9000));
		employees.add( new SalesManager(202, "yash", 10000, 19, 6500));
		employees.add( new SalesManager(203, "nagesh", 23000, 10, 2300));
		employees.add( new Admin(301, "maruti", 90000, 80000));
		employees.add( new Admin(302, "kavita", 67000, 1200));
		employees.add( new Admin(303, "disha", 89000, 10000));
		employees.add( new Admin(304, "indumati", 79000, 18000));
	}
	public boolean addEmployee(Employee e) {
	       return employees.add(e);
    }
	
    public Employee searchEmployeeById(int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                return employees.get(i);
            }
        }
        return null;
    }

  
    public boolean updateEmployee(int id, double newSalary) {
        Employee emp = searchEmployeeById(id);
        if (emp != null) {
            emp.setSalary(newSalary);
            return true;
        }
        return false;
    }

    public boolean deleteEmployee(int id) {
    	 Employee emp = searchEmployeeById(id);
         if (emp != null) {
        	 employees.remove(emp);
             return true;
         }
         return false;
    }
 
    

    public  ArrayList<Employee> getAllEmployee() {
        
        return employees;
    }
   

	
}
