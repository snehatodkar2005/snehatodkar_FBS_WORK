package p11;

import java.util.TreeSet;
//before  generics
//class Student implements Comparable{

//after generics
 class Student implements Comparable<Student>{
	
	int roll_no;
	String name;
	double marks;
	
	//before ganerics
//	public int compareTo(Object o) {
//		Student s1=(Student)o;
//		//return this.roll_no-s1.roll_no;
//		return s1.roll_no-this.roll_no;//descending order sort
		
	

 
 //}
	//after generics 
	public int compareTo(Student s1) {
		// TODO Auto-generated method stub
		//return this.roll_no-s1.roll_no;
		//return this.name.compareTo(s1.name);
		return  (int) (this.marks-s1.marks);
		
	}
	
	
	public Student() {
		this.roll_no = 101;
		this.name = "sneha";
		this.marks = 90.12;
	}
	public Student(int roll_no, String name, double marks) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.marks = marks;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public String toString() {
		return "StudentCollection \nroll_no=" + roll_no + ", name=" + name + ", marks=" + marks;
	}
	
	
	
	
	
	

}//class student ends here


public class StudtestCollection
{
	public static void main(String[] args) {
		//before generics
		
//		TreeSet t1=new TreeSet();
//		t1.add(new Student(12, "SAKSHI", 450));
//		t1.add(new Student(11, "Sanika", 750));
//		t1.add(new Student(1, "yash", 390));
		
		
		//after generics
		TreeSet<Student> t1=new TreeSet<Student>();
		t1.add(new Student(12, "SAKSHI", 450));
		t1.add(new Student(11, "Sanika", 750));
		t1.add(new Student(1, "yash", 390));
		
		System.out.println(t1);
		
		
	}
		
	
}
