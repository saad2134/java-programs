import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // duplicate, ignored

        // Print set
        System.out.println("LinkedHashSet contents: " + set);

        // Check if an element exists
        System.out.println("Contains 'Banana'? " + set.contains("Banana"));

        // Remove an element
        set.remove("Cherry");
        System.out.println("After removing 'Cherry': " + set);

        // Size
        System.out.println("Size of set: " + set.size());

        // Is it empty?
        System.out.println("Is set empty? " + set.isEmpty());
    }
}
