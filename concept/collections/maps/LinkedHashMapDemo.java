import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Put key-value pairs
        map.put(10, "Apple");
        map.put(5, "Banana");
        map.put(8, "Cherry");
        map.put(5, "Blueberry"); // overwrite value for key 5

        // Print map (will preserve insertion order)
        System.out.println("LinkedHashMap contents: " + map);

        // Get value by key
        System.out.println("Value for key 5: " + map.get(5));

        // Check existence
        System.out.println("Contains key 8? " + map.containsKey(8));

        // Remove a key
        map.remove(10);
        System.out.println("After removing key 10: " + map);

        // Iterate through entries
        System.out.println("Iterating through entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Size
        System.out.println("Map size: " + map.size());
    }
}
