
class Student
{
int fbs_id;
String s_name;
double distance_travelled;
static int student_count;
static{
	student_count=0;
}

	int getFbsid()
	{
		return this.fbs_id;
	}
	String getStudentName()
	{
		return this.s_name;
	}
	double getDistanceTravelled()
	{
		return this.distance_travelled;
	}
	static int getStudentCount()//static function
	{
		return student_count;
	}//getter ends here

	void setFbsid(int i)
	{
		 this.fbs_id=i;
	}
	void setStudentName(String n)
	{
		this.s_name=n;
	}
	void setDistanceTravelled(double d)
	{
		this.distance_travelled=d;
	}
	static void setStudentCount(int c)
	{
		student_count=c;
	}//setter ends here

	void display()
	{
		System.out.println("Student id: "+this.fbs_id);
		System.out.println("Student name: "+this.s_name);
		System.out.println("Distance travelled: "+this.distance_travelled);
		System.out.println("Student count: "+this.student_count);
	}//diaplay function ends here

	Student()
	{
		System.out.println("Default Constructor");
		this.fbs_id=1;
		this.s_name="sneha";
		this.distance_travelled=10;
		student_count++;
	}//default cons ends here

	Student(int a,String h,double b)
	{
		System.out.println("Parametrize Constructor");
		this.fbs_id=a;
		this.s_name=h;
		this.distance_travelled=b;
		student_count++;
	}//parameterize const ends here
}//class student ends here

class PlacedStudent extends Student //is-a //step 1
{
	String companyName;
	String desgn;
	
	PlacedStudent() {
		super();//step 2 A
		this.companyName = "Bcci";
		this.desgn = "work as student";
	}

	PlacedStudent(int a, String h, double b, String companyName, String desgn) {
		super(a, h, b);
		this.companyName = companyName;
		this.desgn = desgn;
	}

	String getCompanyName() {
		return companyName;
	}

	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	String getDesgn() {
		return desgn;
	}

	void setDesgn(String desgn) {
		this.desgn = desgn;
	}

	void display()
	{
		super.display();//step 3	
		System.out.println("Cname is "+this.companyName);
		System.out.println("Designation "+this.desgn);
	}
	
	
	
	
}//class placed student ends here

class TestStudent
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.display();
		Student s2=new Student(5,"sakshi",15);
		s2.display();
		PlacedStudent ps1=new PlacedStudent();
		ps1.display();
		PlacedStudent ps2=new PlacedStudent(10,"sneha",300,"accenture","student");
		ps2.display();
		System.out.println("Total student "+Student.getStudentCount());
	}//main ends here
}//class boktest ends here
