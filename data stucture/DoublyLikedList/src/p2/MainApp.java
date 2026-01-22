package p2;

import java.util.Scanner;

import p2.DoublyLikedListEmployee;

	public class MainApp {
		

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
		        DoublyLikedListEmployee list = new DoublyLikedListEmployee();
		        int choice;

		        do {
		            System.out.println("\n===== Employee Doubly Linked List Menu =====");
		            System.out.println("1. Insert Employee at Specific Position");
		            System.out.println("2. Delete Employee at Specific Position");
		            System.out.println("3. Display List (Forward)");
		            System.out.println("5. Exit");
		            System.out.print("Enter your choice: ");
		            choice = sc.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter Employee ID: ");
		                    int id = sc.nextInt();
		                    sc.nextLine(); // consume newline
		                    System.out.print("Enter Employee Name: ");
		                    String name = sc.nextLine();
		                    System.out.print("Enter Employee Salary: ");
		                    double salary = sc.nextDouble();
		                    System.out.print("Enter Position to Insert: ");
		                    int pos = sc.nextInt();
		                    Employee emp = new Employee(id, name, salary);
		                    list.insertAtSpecificPosition(emp, pos);
		                    break;

		                case 2:
		                    System.out.print("Enter Position to Delete: ");
		                    int delPos = sc.nextInt();
		                    list.deleteAtSpecificPosition(delPos);
		                    break;

		                case 3:
		                    list.displayForward();
		                    break;

		                case 5:
		                    System.out.println(" Exiting program. Goodbye!");
		                    break;

		                default:
		                    System.out.println(" Invalid choice! Please try again.");
		            }
		        } while (choice != 5);

		        sc.close();
		    }
		}
