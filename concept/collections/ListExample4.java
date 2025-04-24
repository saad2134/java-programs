import java.util.*;

public class ListExample4 {
    public static void main(String args[]) {
        // creating a list
        List<Double> list = new ArrayList<Double>();
        // adding elements into the list
        list.add(10.8);
        list.add(25.6);
        list.add(38.4);
        list.add(33.2);
        // iterating the list element using for-each loop
        for (double number : list)
            System.out.println(number);
    }
}