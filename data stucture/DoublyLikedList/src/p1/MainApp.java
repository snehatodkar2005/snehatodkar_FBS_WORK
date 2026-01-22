package p1;

import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		
		DoublyLikedList ddl=new DoublyLikedList();
		Scanner sc=new Scanner(System.in);
		int choice,data,pos;//in choice we use only datatype as  string, enum,char or int
		
		do
		{
			System.out.println("\t1.insert at Beginning");
			System.out.println("\t2.insert at End");
			System.out.println("\t3.insert at specific position");
			System.out.println("\t4.Display Forward");
			System.out.println("\t5.EXIT");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:{
				System.out.println("Enter data:");
				data=sc.nextInt();
				ddl.insertAtBeginning(data);
				break;
			}
			
			case 2:
			{
				System.out.println("Enter data:");
				data=sc.nextInt();
				ddl.insertAtEnd(data);
				break;
			}
			case 3:
			{
				System.out.println("Enter data:");
				data=sc.nextInt();
				System.out.println("Enter position");
				pos=sc.nextInt();
				ddl.insertAtPosition(data,pos);
				break;
			}
			case 4:{
				ddl.displayForward();
				break;
			}
			case 5:{
				System.out.println("bye thank you");
				break;
			}
			default:{
				System.out.println("invalid choice");
			}
			
			
			}
		}while(choice!=5);
		sc.close();
	}
	
		
	
}