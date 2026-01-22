package p2;

import p2.Node;

public class DoublyLikedListEmployee {
	Node start,end;
	static int count=0;

	public void insertAtSpecificPosition(Employee emp, int pos) {
        Node temp = new Node(emp);

        // Invalid position
        if (pos <= 0 || pos > count + 1) {
            System.out.println("Invalid position!");
            return;
        }

        // Insert at beginning
        if (pos == 1) {
            if (start == null) {
                start = temp;
                end = temp;
            } else {
                temp.next = start;
                start.prev = temp;
                start = temp;
            }
            count++;
            System.out.println("Employee inserted at position 1 (beginning)");
            return;
        }

        // Insert at end
        if (pos == count + 1) {
            temp.prev = end;
            if (end != null)
                end.next = temp;
            end = temp;
            if (start == null)
                start = temp;
            count++;
            System.out.println("Employee inserted at the end");
            return;
        }

        // Insert in the middle
        Node itr;
        if (pos <= count / 2) {
            itr = start;
            for (int i = 1; i < pos - 1; i++) {
                itr = itr.next;
            }
        } else {
            itr = end;
            for (int i = count; i >= pos; i--) {
                itr = itr.prev;
            }
        }

        temp.next = itr.next;
        temp.prev = itr;
        itr.next.prev = temp;
        itr.next = temp;
        count++;

        System.out.println("Employee inserted at position " + pos);
    }

    // ✅ Delete Employee at a specific position
    public void deleteAtSpecificPosition(int pos) {
        if (start == null) {
            System.out.println("List is empty!");
            return;
        }

        if (pos <= 0 || pos > count) {
            System.out.println("Invalid position!");
            return;
        }

        // Delete first node
        if (pos == 1) {
            if (start == end) {
                start = null;
                end = null;
            } else {
                start = start.next;
                start.prev = null;
            }
            count--;
            System.out.println("Employee deleted from position 1 (beginning)");
            return;
        }

        // Delete last node
        if (pos == count) {
            end = end.prev;
            if (end != null)
                end.next = null;
            count--;
            System.out.println("Employee deleted from last position");
            return;
        }

        // Delete in middle
        Node itr;
        if (pos <= count / 2) {
            itr = start;
            for (int i = 1; i < pos - 1; i++) {
                itr = itr.next;
            }
        } else {
            itr = end;
            for (int i = count; i > pos; i--) {
                itr = itr.prev;
            }
        }

        Node toDelete = itr.next;
        itr.next = toDelete.next;
        toDelete.next.prev = itr;

        count--;
        System.out.println("Employee deleted at position " + pos);
    }

    // ✅ Display all Employees forward
    public void displayForward() {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        Node itr = start;
        System.out.print("Employees (Forward): ");
        while (itr != null) {
            System.out.print(itr.data + " <--> ");
            itr = itr.next;
        }
        System.out.println("NULL");
    }
}
