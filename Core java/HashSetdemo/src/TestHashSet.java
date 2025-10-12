import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;




class Student implements Comparable<Student>{
	
	int roll_no;
	String name;
	double marks;
	
	
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
	
	public int hashCode() {
		System.out.println("inside hashcode");
		return this.roll_no;
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
		return "\nroll_no=" + roll_no + ", name=" + name + ", marks=" + marks;
	}

	public int compareTo(Student s1) {
		// TODO Auto-generated method stub
		System.out.println("inside compareTo");
		return this.roll_no-s1.roll_no;
		
		
		
	}
	


}//class student ends here 

public class TestHashSet {
	
	
	public static void main1(String[] args) {
		
		
		HashSet h1=new HashSet();
		h1.add(new Student(102, "Nagesh", 500));
		h1.add(new Student(101, "sneha", 400));
		h1.add(new Student(103, "yash", 300));
		h1.add(new Student(107, "sanika", 450));
		h1.add(new Student(104, "kavita", 600));
		h1.add(new Student(105, "maruti", 550));
		System.out.println(h1);
		
//		if(h1.contains(new Student(12, "SAKSHI", 450)))
//		{
//			System.out.println("Found");
//		}
//		else
//		{
//			System.out.println("not found");
//		}
		
		
	}
	
	public static void main(String[] args) {
		ArrayList<Student> a1=new ArrayList<Student>();
		a1.add(new Student(101,"sneha",30000));
		a1.add(new Student(102,"sakshi",12000));
		a1.add(new Student(103,"gayatri",35000));
		a1.add(new Student(100,"yash",35000));
		
		System.out.println("before sorting\n"+a1);
		Collections.sort(a1);//sort is static function of collection class
		System.out.println("after sorting\n"+a1);
		
		for(Student s1:a1)
		{
			System.out.println(s1.getName());
		}
		
	}

}
