import java.util.*;

public class MapExample {
    public static void main(String args[]) {
        Map map = new HashMap();
        map.put(1, "sonu");
        map.put(5, "sindu");
        map.put(2, "divya");
        map.put(5, "ammu");
        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}