package linklist;
import java.util.Scanner;

public class MyLinkedList {
	Node start;

	public void addFirst(int data) {
		Node temp = new Node(data);
		temp.next = start;
		start = temp;
		System.out.println("Data Added...");
	}

	public void addLast(int data) {
		Node temp = new Node(data);
		if (start == null) {
			start = temp;
		} else {
			Node itr = start;
			while (itr.next != null) {
				itr = itr.next;
			}
			itr.next = temp;
		}
		System.out.println("Data Added...");
	}

	public void display() {
		if (start == null) {
			System.out.println("No data in the LL..");
		} else {
			System.out.println("All Elements in LL : ");
			Node itr = start;
			while (itr.next != null) {
				System.out.print(itr.getData() + " -> ");
				itr = itr.next;
			}
			System.out.print(itr.getData() + " -> NULL\n");
		}
	}

	public void addPos(int pos, int data) {
		Node temp = new Node(data);

		if (pos == 1) {
			temp.next = start;
			start = temp;
			System.out.println("Data Added at Position " + pos);
			return;
		}

		Node itr = start;
		int i = 1;

		while (itr != null && i < pos - 1) {
			itr = itr.next;
			i++;
		}
		if (itr == null) {
			System.out.println("Invalid position!");
			return;
		}
		

		temp.next = itr.next;
		itr.next = temp;
		System.out.println("Data Added at Position " + pos);
		
	}
	
	
	public void delFirst() {
        if (start == null) {
            System.out.println("List is empty. Nothing to remove.");
        } else {
            System.out.println("Removed element: " + start.data);
            start = start.next; 
        }
    }
	
	
	
	public void delLast() {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }

        if (start.next == null) {
            System.out.println("Removed element: " + start.data);
            start = null;
            return;
        }

        Node temp = start;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        System.out.println("Removed element: " + temp.next.data);
        temp.next = null; 
    }

	
	public void deletePos() {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();

        if (start == null) {
            System.out.println("List is empty. Nothing to delete!");
            return;
        }

        if (pos <= 1) {
            start = start.next;
            System.out.println("Node deleted at position 1");
            return;
        }

        Node itr = start;
        int i = 1;
        while (i < pos - 1 && itr.next != null) {
            itr = itr.next;
            i++;
        }

        if (itr.next == null) {
            System.out.println("Invalid position! No node exists at position " + pos);
            return;
        }

        itr.next = itr.next.next;
        System.out.println("Node deleted at position " + pos);
    }
	
	
	public void revList()
	{
		
	}
}