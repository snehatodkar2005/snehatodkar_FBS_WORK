class Employee {
	int empId;
	String empName;
	double salary;
	Employee() {//default constructor
		this.empId=101;
		this.empName="sneha";
		this.salary=50000;
		
	}
	Employee(int emp_id, String emp_name, double salary) {//parameterized constructor
		this.empId = emp_id;
		this.empName = emp_name;
		this.salary = salary;
	}
	
	int getEmp_id() {
		return empId;
	}//getter
	void setEmp_id(int emp_id) {
		this.empId = emp_id;
	}//setter
	String getEmp_name() {
		return empName;
	}//getter
	void setEmp_name(String emp_name) {
		this.empName = emp_name;
	}//setter
	double getSalary() {
		return salary;
	}//getter
	void setSalary(double salary) {
		this.salary = salary;
	}//setter
	
	void display()
	{
		System.out.println("ID:"+this.empId);
		System.out.println("Name:"+this.empName);
		System.out.println("Salary:"+this.salary);
		
	}//display function
	
	
	
}
class TestEmployee {

	public static void main(String[] args) {
		
		Employee employee1=new Employee();
		employee1.display();
		}

}
