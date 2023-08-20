import java.util.PriorityQueue;

public class CO4P13 {

    public static void main(String[] args) {
        // Create a priority queue of integers
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the priority queue with different priorities
        priorityQueue.add(20);
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(5);

        System.out.println("Priority Queue elements: " + priorityQueue);

        // Peek at the highest priority element without removing it
        System.out.println("Highest priority element: " + priorityQueue.peek());

        // Remove and print elements in ascending priority order
        System.out.println("Elements removed in ascending priority order:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
