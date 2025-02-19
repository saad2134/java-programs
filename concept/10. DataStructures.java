// IMPORTANT: class name must be same as file name.
// EG: FILE.java then 
// class FILE {
// }

import java.util.*;

public class DataStructuresDemo {
    public static void main(String[] args) {
        String input = args[0];
        int n = Integer.parseInt(input);

        // ArrayList Demonstration
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arrayList.add(i);
        }
        System.out.println("ArrayList: " + arrayList);

        // LinkedList Demonstration
        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
        System.out.println("LinkedList: " + linkedList);

        // HashSet Demonstration
        Set<Integer> hashSet = new HashSet<>(arrayList);
        System.out.println("HashSet: " + hashSet);

        // HashMap Demonstration
        Map<Integer, String> hashMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            hashMap.put(i, "Value" + i);
        }
        System.out.println("HashMap: " + hashMap);
    }
}

//To execute run following in command line.
//java DataStructuresDemo.java <number>
//java DataStructuresDemo.java 5
