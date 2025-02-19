// IMPORTANT: class name must be same as file name.
// EG: FILE.java then 
// class FILE {
// }

public class StringOperations {
    public static void main(String[] args) {
        String input = args[0];
        
        System.out.println("Original String: " + input);
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("Length: " + input.length());
        System.out.println("First Character: " + input.charAt(0));
        System.out.println("Last Character: " + input.charAt(input.length() - 1));
        System.out.println("Reversed: " + new StringBuilder(input).reverse().toString());
    }
}

//To execute run following in command line.
//java StringOperations.java <string>
//java StringOperations.java hello
