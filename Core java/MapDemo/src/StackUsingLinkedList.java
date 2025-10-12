
import java.util.LinkedList;

public class StackUsingLinkedList {
    public static void main(String[] args) {
        
        // Create a LinkedList to act as Stack
        LinkedList<String> stack = new LinkedList<>();

        // Push elements (add at top)
        stack.push("Sneha");
        stack.push("Sakshi");
        stack.push("Gayatri");

        System.out.println("Stack: " + stack);

        // Peek (top element)
        System.out.println("Top element (peek): " + stack.peek());

        // Pop element (remove from top)
        stack.pop();
        System.out.println("After one pop: " + stack);

        // Check size and empty
        System.out.println("Stack size: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

