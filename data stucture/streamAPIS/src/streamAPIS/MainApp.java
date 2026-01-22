package streamAPIS;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
	public static void main(String[] args) {
		
		List<Student> allStudent=new ArrayList<Student>();
		allStudent.add(new Student(1,"sneha","F",80.90));
		allStudent.add(new Student(2,"sakshi","F",91.89));
		allStudent.add(new Student(3,"yash","M",92.9));
		allStudent.add(new Student(4,"sanika","F",93.8));
		
		//iteration
		//for each
		
		//allStudent.stream().forEach(ref->System.out.println(ref.getName()));//terminal operation
		
		//filtering
		//allStudent.stream().filter(merimarji->merimarji.getMarks()>90).forEach(ref->System.out.println(ref.getName()));
		double avgmarks=allStudent.stream().filter(ref->ref.getGender().equals("M")).mapToDouble(ref->ref.getMarks()).average().getAsDouble();
		System.out.println(avgmarks);
		
		
	}

}
