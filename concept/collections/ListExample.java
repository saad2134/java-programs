import java.util.*;

public class ListExample {
    public static void main(String args[]) {
        // creating a list
        List<Integer> list = new ArrayList<Integer>();
        // adding elements into the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        // iterating the list element using for-each loop
        for (int number : list)
            System.out.println(number);
    }
}