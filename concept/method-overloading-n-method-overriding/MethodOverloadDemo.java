public class MethodOverloadDemo {
    static void test() {
        System.out.println("No parameters.");
    }
    static void test(int a) {
        System.out.println("a: "+a);
    }
    static void test(int a, int b) {
        System.out.println("a: "+a+" & b: "+b);
    }
    static double test(double a) {
        System.out.println("a: "+a);
        return a*a;
    }
    public static void main(String[] args) {
        test();
        test(1);
        test(1,2);
        test(1.1);
    }
}