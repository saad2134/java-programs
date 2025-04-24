import java.util.*;

public class ListExample1 {
    public static void main(String args[]) {
        // creating a list
        List<String> list = new ArrayList<String>();
        // adding elements into the list
        list.add("Mango");
        list.add("Apple");
        list.add("Grapes");
        list.add("Banana");
        // iterating the list element using for-each loop
        for (String fruit : list)
            System.out.println(fruit);
    }
}