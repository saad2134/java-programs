import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        // Put key-value pairs
        map.put(20, "Banana");
        map.put(10, "Apple");
        map.put(30, "Cherry");
        map.put(25, "Blueberry");

        // Print map (sorted by key)
        System.out.println("TreeMap contents (sorted by keys): " + map);

        // Get first and last keys
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());

        // Get value by key
        System.out.println("Value for key 25: " + map.get(25));

        // Remove a key
        map.remove(20);
        System.out.println("After removing key 20: " + map);

        // Iterate through keys and values
        System.out.println("Iterating through entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Size
        System.out.println("Map size: " + map.size());
    }
}
