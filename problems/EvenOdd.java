public class EvenOdd {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        if (n%2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
