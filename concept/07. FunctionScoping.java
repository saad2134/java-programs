// IMPORTANT: class name must be same as file name.
// EG: FILE.java then 
// class FILE {
// }

public class FunctionScoping {
    public static void main(String[] args) {
        String input = args[0];
        int num = Integer.parseInt(input);
        System.out.println("Square of " + num + " is: " + square(num));
    }

    public static int square(int x) {
        int result = x * x; // Local variable inside function
        return result;
    }
}

//To execute run following in command line.
//java FunctionScoping.java <number>
//java FunctionScoping.java 5
