import java.util.*;
class ListLinked {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Saad");
        list.add("Sam");
        list.add("John");
        list.add("James");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}