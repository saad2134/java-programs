import java.util.Enumeration;
import java.util.Vector;

class ListVector {
    public static void main(String[] args) throws Exception {
        Vector v = new Vector();
        v.add("a");
        v.add("b");
        v.add("c");
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            Object o = e.nextElement();
            System.out.println(o);
        }
    }
}