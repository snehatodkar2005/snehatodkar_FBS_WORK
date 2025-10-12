import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;




class Student12 implements Comparable<Student12>{
	
	int roll_no;
	String name;
	double marks;
	
	
	public boolean equals(Object obj) {
		System.out.println("inside equals");
		Student12 s1=(Student12)obj;
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
	
	public Student12() {
		this.roll_no = 101;
		this.name = "sneha";
		this.marks = 90.12;
	}
	public Student12(int roll_no, String name, double marks) {
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

	public int compareTo(Student12 s1) {
		// TODO Auto-generated method stub
		System.out.println("inside compareTo");
		return this.roll_no-s1.roll_no;
		
		
		
	}
	


}//class student ends here 

	
	





public class TestCollection {
	
public static void main12(String[] args) {
		
		
		HashSet h1=new HashSet();
		h1.add(new Student12(102, "Nagesh", 500));
		h1.add(new Student12(101, "sneha", 400));
		h1.add(new Student12(103, "yash", 300));
		h1.add(new Student12(107, "sanika", 450));
		h1.add(new Student12(104, "kavita", 600));
		h1.add(new Student12(105, "maruti", 550));
		
		
		if(h1.contains(new Student12(102,"Nagesh",500)))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("not found");
		}
		
		System.out.println(h1);
		
		
	}
	
	public static void main1(String[] args) {
		ArrayList<Student12> a1=new ArrayList<Student12>();
		a1.add(new Student12(101,"sneha",30000));
		a1.add(new Student12(102,"sakshi",12000));
		a1.add(new Student12(103,"gayatri",35000));
		a1.add(new Student12(100,"yash",35000));
		
		System.out.println("before sorting\n"+a1);
		Collections.sort(a1);//sort is static function of collection class
		System.out.println("after sorting\n"+a1);
		
		for(Student12 s1:a1)
		{
			System.out.println(s1.getName());
		}
		
	}
	public static void main(String[] args) {

		TreeSet<Student12> t1 = new TreeSet<Student12>();
		t1.add(new Student12(57, "sneha", 450));
		t1.add(new Student12(34, "sakshi", 590));
		t1.add(new Student12(88, "Dhoni", 700));

		System.out.println(t1);

		if (t1.contains(new Student12(34, "Rahul", 590)))

		{
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

	}
	

}
