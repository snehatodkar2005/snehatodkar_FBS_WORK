import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Enqueue(add elements)
        queue.offer("Sneha");
        queue.offer("Sakshi");
        queue.offer("Gayatri");

        System.out.println("Queue: " + queue);

        // Peek (see front element)
        System.out.println("Front element (peek): " + queue.peek());

        // Dequeue (remove element from front)
        queue.poll(); // removes Sneha
        System.out.println("After one dequeue (poll): " + queue);

        // Check size and if empty
        System.out.println("Queue size: " + queue.size());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
