package p11;



import java.util.*;

//-------------------- Student Class --------------------
class Student2 {
    private int roll_no;
    private String name;
    private double marks;

    // Default Constructor
    public Student2() {
        this.roll_no = 0;
        this.name = "Unknown";
        this.marks = 0.0;
    }

    // Parameterized Constructor
    public Student2(int roll_no, String name, double marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }

    // Getters and Setters
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

    // toString method
    @Override
    public String toString() {
        return "Student [Roll No=" + roll_no + ", Name=" + name + ", Marks=" + marks + "]";
    }
}

//-------------------- Comparator Classes --------------------

// Sort by Roll Number
class RollNoComparator implements Comparator<Student2> {
    public int compare(Student2 s1, Student2 s2) {
        return s1.getRoll_no() - s2.getRoll_no();
    }
}

// Sort by Name
class NameComparator implements Comparator<Student2> {
    public int compare(Student2 s1, Student2 s2) {
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
}

// Sort by Marks (Descending order)
class MarksComparator implements Comparator<Student2> {
    public int compare(Student2 s1, Student2 s2) {
        return Double.compare(s2.getMarks(), s1.getMarks());
    }
}

//-------------------- Main Class --------------------
public class MenudrivenCode {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create a list of students
        List<Student2> list = new ArrayList<>();
        list.add(new Student2(12, "SAKSHI", 450));
        list.add(new Student2(11, "Sanika", 750));
        list.add(new Student2(1, "Yash", 390));
        list.add(new Student2(13, "Sneha", 880));

        int choice = 0;

        while (choice != 4) {
            System.out.println("\n===== STUDENT SORT MENU =====");
            System.out.println("1. Sort by Roll Number");
            System.out.println("2. Sort by Name");
            System.out.println("3. Sort by Marks (Descending)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            TreeSet<Student2> tset = null;

            if (choice == 1) {
                tset = new TreeSet<>(new RollNoComparator());
            } 
            else if (choice == 2) {
                tset = new TreeSet<>(new NameComparator());
            } 
            else if (choice == 3) {
                tset = new TreeSet<>(new MarksComparator());
            } 
            else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } 
            else {
                System.out.println("Invalid choice! Please try again.");
                continue;
            }

            // Add all students to TreeSet (auto-sorted)
            tset.addAll(list);

            // Display sorted students
            System.out.println("\n--- Sorted Students ---");
            for (Student2 s : tset) {
                System.out.println(s);
            }
        }

        sc.close();
    }
}

