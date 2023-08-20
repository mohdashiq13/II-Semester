import java.util.Deque;
import java.util.LinkedList;
public class CO4P14 {
    public static void main(String[] args) {
        // Create a deque of strings
        Deque<String> deque = new LinkedList<>();
        // Add elements to the front and back of the deque
        deque.addFirst("First");
        deque.addLast("Last");
        deque.offerFirst("Front");
        deque.offerLast("Back");
        System.out.println("Deque elements: " + deque);
        // Remove elements from the front and back of the deque
        String removedFront = deque.pollFirst();
        String removedBack = deque.pollLast();
        System.out.println("Removed element from the front: " + removedFront);
        System.out.println("Removed element from the back: " + removedBack);
        System.out.println("Deque elements after removal: " + deque);
    }
}
