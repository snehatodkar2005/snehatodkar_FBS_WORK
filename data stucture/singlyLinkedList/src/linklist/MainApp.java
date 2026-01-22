package linklist;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        MyLinkedList myLL = new MyLinkedList();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== Linked List Menu =====");
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Delete");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    
                    System.out.println("\t1. Add First");
                    System.out.println("\t2. Add at Position");
                    System.out.println("\t3. Add Last");
                    System.out.print("Enter your choice: ");
                    int ch = sc.nextInt();
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    switch (ch) {
                        case 1:
                            myLL.addFirst(data);
                            break;

                        case 2:
                            System.out.print("Enter position: ");
                            int pos = sc.nextInt();
                            myLL.addPos(pos, data);
                            break;

                        case 3:
                            myLL.addLast(data);
                            break;

                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;

                case 2:
                    myLL.display();
                    break;
                    
                    
                case 3:
                	System.out.println("\t1. Remove First");
                    System.out.println("\t2. Remove Last");
                    System.out.println("\t3. Remove At Specific position");
                    
                    System.out.print("Enter your choice: ");
                    int ch1 = sc.nextInt();
                    
                    switch (ch1) {
                        case 1:
                            myLL.delFirst();
                            break;

                        case 2:
                            myLL.delLast();
                            break;
                            
                        case 3:
                        	myLL.deletePos();
                        	break;

                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;
                	
                	
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (true);
    }
}