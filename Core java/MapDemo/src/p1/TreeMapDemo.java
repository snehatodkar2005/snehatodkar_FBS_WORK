package p1;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

import p1.MyStudentMarksComparator;
import p1.MyStudentnameComparator;
import p1.MyStudentRollComparator;
import p1.Student;

class MyKey implements Comparable
{
	int key;
	
	MyKey(int k)
	{
		this.key=k;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		MyKey m1= (MyKey)o;
		return this.key-m1.key;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n Key "+this.key;
	}
}
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap tm= new TreeMap();
		tm.put(new MyKey(7), new Student(7,333,"Dhoni"));
		tm.put(new MyKey(10), new Student(10,444,"Dhoni"));
		tm.put(new MyKey(5), new Student(5,777,"Dhoni"));
		
		System.out.println(tm);
		Scanner sc = new Scanner(System.in);
		int choice = 0;

        while (choice != 4) {
            System.out.println("\n===== STUDENT SORT MENU =====");
            System.out.println("1. Sort by Roll Number");
            System.out.println("2. Sort by Name");
            System.out.println("3. Sort by Marks (Descending)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            TreeSet<Student> tset = null;

            if (choice == 1) {
                tset = new TreeSet<>(new MyStudentMarksComparator());
            } 
            else if (choice == 2) {
                tset = new TreeSet<>(new MyStudentRollComparator());
            } 
            else if (choice == 3) {
                tset = new TreeSet<>(new MyStudentnameComparator());
            } 
            else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } 
            else {
                System.out.println("Invalid choice! Please try again.");
                continue;
            }

	}
	}
}

