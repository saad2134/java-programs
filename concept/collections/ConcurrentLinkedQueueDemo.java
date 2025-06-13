import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueDemo {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        // Add elements
        queue.add("Apple");
        queue.add("Banana");
        queue.offer("Cherry");

        // Print contents
        System.out.println("Queue contents: " + queue);

        // Peek (view head without removing)
        System.out.println("Peek: " + queue.peek());

        // Poll (remove and return head)
        System.out.println("Poll: " + queue.poll());
        System.out.println("After poll: " + queue);

        // Size (note: not a constant-time operation)
        System.out.println("Queue size: " + queue.size());

        // Iterate (thread-safe for traversal, but not snapshot-consistent)
        System.out.println("Remaining elements:");
        for (String item : queue) {
            System.out.println(item);
        }
    }
}
