import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println("Stack after pushes: " + stack);

        // Peek at top
        System.out.println("Top element (peek): " + stack.peek());

        // Pop element
        String popped = stack.pop();
        System.out.println("Popped element: " + popped);

        // Stack after pop
        System.out.println("Stack now: " + stack);

        // Search for an element (1-based index from top)
        int pos = stack.search("Apple");
        System.out.println("Position of 'Apple' from top: " + pos);

        // Is it empty?
        System.out.println("Is stack empty? " + stack.empty());
    }
}
