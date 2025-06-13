import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(15);

        // Print queue (note: order in toString is NOT sorted)
        System.out.println("PriorityQueue contents: " + pq);

        // Peek: see the smallest element without removing
        System.out.println("Peek (head): " + pq.peek());

        // Poll: remove and return the smallest element
        System.out.println("Poll (remove head): " + pq.poll());
        System.out.println("After poll: " + pq);

        // Continue polling
        while (!pq.isEmpty()) {
            System.out.println("Next smallest: " + pq.poll());
        }
    }
}
