import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentExceptionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int[] marks = new int[3];
        try {
            System.out.println("Enter student name: ");
            name = scanner.nextLine();
            System.out.println("Enter marks for 3 subjects (0 to 100): ");
            for (int i=0; i<3; i++) {
                System.out.println("Subject "+(i+1)+": ");
                marks[i] = scanner.nextInt();
                if (marks[i] < 0 || marks[i] > 100) {
                    throw new IllegalArgumentException("Marks must be between 0 and 100");
                }
            }
            int total = marks[0] + marks[1] + marks[2];
            double average = total/3.0;
            System.out.println("Student: "+name);
            System.out.println("Average Marks: "+average);
        }
        catch (InputMismatchException e) {
            System.out.println("Input Error: Please Enter numberic values for marks.");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Validaton Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Unexpected error: "+ e.getMessage());
        }
        finally {
            System.out.println("Execution complete. Thank you!");
            scanner.close();
        }
    }
}