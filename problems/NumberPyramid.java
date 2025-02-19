import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of levels: ");
        int l = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= l; i++) {
            // Print leading spaces
            for (int j = 0; j < (l - i) * (l - i - 1) / 2; j++) {
                System.out.print(" ");
            }

            // Print numbers with spaces in between
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print("   "); // Extra spaces between numbers
                }
            }

            System.out.println(); // Move to next line
        }
    }
}
