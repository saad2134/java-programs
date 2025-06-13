import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // duplicate

        // Print set
        System.out.println("HashSet contents: " + set);

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
