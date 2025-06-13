import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Put key-value pairs
        map.put(100, "Apple");
        map.put(200, "Banana");
        map.put(300, "Cherry");
        map.put(200, "Blueberry"); // overwrite

        // Print map
        System.out.println("ConcurrentHashMap contents: " + map);

        // Get value by key
        System.out.println("Value for key 200: " + map.get(200));

        // Check if key/value exists
        System.out.println("Contains key 300? " + map.containsKey(300));
        System.out.println("Contains value 'Cherry'? " + map.containsValue("Cherry"));

        // Remove key
        map.remove(100);
        System.out.println("After removing key 100: " + map);

        // Replace value
        map.replace(300, "Cranberry");
        System.out.println("After replacing value for key 300: " + map);

        // Size
        System.out.println("Map size: " + map.size());
    }
}
