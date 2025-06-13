import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Add elements at the end
        deque.add("Apple");
        deque.add("Banana");

        // Add elements at the front and rear
        deque.addFirst("Mango");
        deque.addLast("Cherry");

        // Print contents
        System.out.println("ArrayDeque contents: " + deque);

        // Peek at both ends
        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());

        // Remove elements from both ends
        deque.removeFirst();
        deque.removeLast();
        System.out.println("After removing first and last: " + deque);

        // Offer (returns boolean, doesn't throw exception)
        deque.offerFirst("Guava");
        deque.offerLast("Lemon");
        System.out.println("After offering elements: " + deque);

        // Polling
        System.out.println("Poll first: " + deque.pollFirst());
        System.out.println("Poll last: " + deque.pollLast());
        System.out.println("Final contents: " + deque);
    }
}
