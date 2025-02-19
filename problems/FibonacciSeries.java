// IMPORTANT: class name must be same as file name.
// EG: FILE.java then 
// class FILE {
// }

public class FibonacciSeries {
    public static void main(String[] args) {
        String input = args[0];
        int n = Integer.parseInt(input);
        
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b);
        
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}

//To execute run following in command line.
//java FibonacciSeries.java <number>
//java FibonacciSeries.java 10
