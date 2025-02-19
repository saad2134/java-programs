import java.util.*;
// IMPORTANT: class name must be same as file name.
// EG: FILE.java then 
// class FILE {
// }

class TakeInput2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("The given number is "+ n);

    }
}
