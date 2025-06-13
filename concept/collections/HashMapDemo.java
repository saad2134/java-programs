import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Put key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(2, "Blueberry"); // overwrite value for key 2

        // Print map
        System.out.println("HashMap contents: " + map);

        // Get value by key
        System.out.println("Value for key 2: " + map.get(2));

        // Check for key
        System.out.println("Contains key 3? " + map.containsKey(3));

        // Check for value
        System.out.println("Contains value 'Cherry'? " + map.containsValue("Cherry"));

        // Remove a key
        map.remove(1);
        System.out.println("After removing key 1: " + map);

        // Size
        System.out.println("Map size: " + map.size());
    }
}
