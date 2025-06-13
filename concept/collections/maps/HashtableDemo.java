import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        // Add key-value pairs
        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Cherry");
        table.put(2, "Blueberry"); // overwrite value for key 2

        // Print hashtable
        System.out.println("Hashtable contents: " + table);

        // Get value
        System.out.println("Value for key 2: " + table.get(2));

        // Check for key
        System.out.println("Contains key 3? " + table.containsKey(3));

        // Check for value
        System.out.println("Contains value 'Cherry'? " + table.containsValue("Cherry"));

        // Remove entry
        table.remove(1);
        System.out.println("After removing key 1: " + table);

        // Size
        System.out.println("Size of table: " + table.size());
    }
}
