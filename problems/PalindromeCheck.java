// IMPORTANT: class name must be same as file name.
// EG: FILE.java then 
// class FILE {
// }

public class PalindromeCheck {
    public static void main(String[] args) {
        String input = args[0];
        int num = Integer.parseInt(input);
        
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
    
    public static boolean isPalindrome(int n) {
        int original = n, reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }
}

//To execute run following in command line.
//java PalindromeCheck.java <number>
//java PalindromeCheck.java 121
