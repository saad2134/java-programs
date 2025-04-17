public class mathop {

     int add( int a, int b) {
        return a+b;
     }
     double add(double a, double b) {
        return a+b;
     }
     int add(int a, int b, int c) {
        return a+b+c;
     }
     public static void main(String[] args) {
        mathop mo = new mathop();
        System.out.println("Sum of 2 integers: "+mo.add(5,10));
        System.out.println("Sum of 3 integers: "+mo.add(5,10, 15));
        System.out.println("Sum of 2 doubles: "+mo.add(5.5, 10.5));
     }
}