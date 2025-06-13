import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        // Add elements
        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");
        set.add("Apple"); // duplicate

        // Print set (will be sorted alphabetically)
        System.out.println("TreeSet contents (sorted): " + set);

        // First and last elements
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        // Remove element
        set.remove("Banana");
        System.out.println("After removing 'Banana': " + set);

        // Check existence
        System.out.println("Contains 'Apple'? " + set.contains("Apple"));

        // Size
        System.out.println("Size of set: " + set.size());
    }
}
