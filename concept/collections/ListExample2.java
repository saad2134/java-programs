import java.util.*;

public class ListExample2 {
    public static void main(String args[]) {
        // creating a list
        List<Float> list = new ArrayList<Float>();
        // adding elements into the list
        list.add(10.8f);
        list.add(25.6f);
        list.add(38.4f);
        list.add(33.2f);
        // iterating the list element using for-each loop
        for (float number : list)
            System.out.println(number);
    }
}