// IMPORTANT: class name must be same as file name.
// EG: FILE.java then 
// class FILE {
// }

public class ReverseNumber {
    public static void main(String[] args) {
        String input = args[0];
        int num = Integer.parseInt(input);
        int reversed = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        System.out.println("Reversed Number: " + reversed);
    }
}

//To execute run following in command line.
//java ReverseNumber.java <number>
//java ReverseNumber.java 5
