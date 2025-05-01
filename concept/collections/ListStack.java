import java.util.Enumeration;
import java.util.Stack;

class ListStack {
    public static void main(String[] args) throws Exception {
        Stack s = new Stack();
        s.add("a");
        s.add("b");
        s.add("c");
        Enumeration e = s.elements();
        while (e.hasMoreElements()) {
            Object o = e.nextElement();
            System.out.println(o);
        }
    }
}