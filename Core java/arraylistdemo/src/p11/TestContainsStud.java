package p11;

import java.util.ArrayList;
import java.util.TreeSet;
//before  generics
//class Student implements Comparable{

//after generics
class Student1 implements Comparable<Student1>{
	
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
	public int compareTo(Student1 s1) {
		// TODO Auto-generated method stub
		//return this.roll_no-s1.roll_no;
		//return this.name.compareTo(s1.name);
		System.out.println("inside compareTo");
		return  (int) (this.marks-s1.marks);
		
	}
	
	
	public Student1() {
		this.roll_no = 101;
		this.name = "sneha";
		this.marks = 90.12;
	}
	public Student1(int roll_no, String name, double marks) {
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
	//for arraylist contains
	@Override
	public boolean equals(Object obj) {
		System.out.println("inside equals");
		Student s1=(Student)obj;
		if(this.roll_no==s1.roll_no)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}//class student ends here


public class TestContainsStud
{
	public static void main1(String[] args) {
		//before generics
		
//		TreeSet t1=new TreeSet();
//		t1.add(new Student(12, "SAKSHI", 450));
//		t1.add(new Student(11, "Sanika", 750));
//		t1.add(new Student(1, "yash", 390));
		
		
		//after generics
		TreeSet<Student1> t1=new TreeSet<Student1>();
		t1.add(new Student1(12, "SAKSHI", 450));
		t1.add(new Student1(11, "Sanika", 750));
		t1.add(new Student1(1, "yash", 390));
		
		System.out.println(t1);
		if(t1.contains(new Student1(12, "SAKSHI", 450)))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("not found");
		}
		
		
	}
			
		public static void main(String[] args)
		{
			ArrayList<Student1> a1=new ArrayList<Student1>();
			a1.add(new Student1(101,"sneha",30000));
			a1.add(new Student1(102,"sakshi",12000));
			a1.add(new Student1(103,"gayatri",35000));
			
			System.out.println(a1);
			
			if(a1.contains(new Student1(101,"sneha",30000)))
			{
				System.out.println("Found");
			}
			else
			{
				System.out.println("not found");
			}
			
		}
		
	
}
