public class Exceptions {

    public static void main(String[] args) {
        int n = 1;
        // Different Types of Exceptions
        if (n==1) {
            try {
                int data =  50/0;
            }
            catch (ArithmeticException e) {
                System.out.println(e);
            }
        }
        else if (n==2) {
            try {
                String s = null;
                System.out.println(s.length());
            }
            catch (NullPointerException e) {
                System.out.println(e);
            }
        }
        else if (n==3) {
            try {
                String s = "abc";
                int i = Integer.parseInt(s);
            }
            catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
        else if (n==4) {
            try {
                int a[] = new int[5];
                a[10] = 50;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
        
        System.out.println("Rest of code.........");
    }
}
