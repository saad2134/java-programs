// IMPORTANT: class name must be same as file name.
// EG: FILE.java then 
// class FILE {
// }

public class FunctionRecursion {
    public static void main(String[] args) {
        String input = args[0];
        int num = Integer.parseInt(input);
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

//To execute run following in command line.
//java FunctionRecursion.java <number>
//java FunctionRecursion.java 5
