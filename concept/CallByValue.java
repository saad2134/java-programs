public class CallByValue {

    public static void main(String[] args) {
        Test ob = new Test(); 
        int a = 15, b = 20;
        System.out.println("a and b before call: ");
        System.out.println(a + " " + b);
        ob.meth(a, b);
        System.out.println("a and b after call: ");
        System.err.println(a + " " + b);
    }
}

class Test { 
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}