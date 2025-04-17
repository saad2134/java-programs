import java.util.Scanner;

public class StudentProgressReport {

    public static void main(String[] args) {
        boolean isWeighted;
        int sem_count;
        int[] sub_count = new int[10];
        String[] sub_name = new String[10];
        int[][] sub_marks = new int[10][10];
        int[][] sub_weights = new int[10][10];
        double[] sem_sgpa = new double[10];
        double cgpa = 0;
        double max_marks;

        Scanner scanner = new Scanner(System.in);

        // Taking the no. of semesters
        System.out.println("\nEnter how many semesters to you want to calculate the result for: ");
        sem_count = Integer.parseInt(scanner.nextLine()); 
        if (sem_count <= 0) {
            System.out.println("\nNo semesters to make progress report for!");
            System.exit();
        }
        

        //Taking Max Marks
        System.out.println("\nEnter max possible GPA: ");
        try {
            max_marks = Double.parseDouble(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Invalid Input! Try Again!");
            return;
        }

        // Taking whether subjects are weighted or not
        System.out.println("\nAre the subjects weighted? ('true'/'false'): ");
        try {
            isWeighted = Boolean.parseBoolean(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Invalid Input! Try Again!");
            return;
        }

        // Now for each semester
        // - Take the no. of subjects and store in sub_count
        // - Take the marks for those subjects and store in sub_marks
        // - if true take weights for the subjects and store in sub_weights
        for (int i = 0; i < sem_count; i++) {
            System.out.print("\nEnter number of subjects for semester " + (i + 1) + ": ");
            sub_count[i] = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character

            // Taking subject names for the semester
            for (int j = 0; j < sub_count[i]; j++) {
                System.out.print("Enter the name of subject " + (j + 1) + ": ");
                sub_name[j] = scanner.nextLine();
            }

            // Taking marks for the subjects
            for (int j = 0; j < sub_count[i]; j++) {
                System.out.print("Enter marks for " + sub_name[j] + ": ");
                sub_marks[i][j] = scanner.nextInt();
                if (sub_marks[i][j] > max_marks) {
                    System.out.println("\nMarks/Points cannot be more than "+max_marks+". Please try again!");
                    System.exit();
                }
            }

            // Taking weights if subjects are weighted
            if (isWeighted) {
                for (int j = 0; j < sub_count[i]; j++) {
                    System.out.print("Enter weight for " + sub_name[j] + ": ");
                    sub_weights[i][j] = scanner.nextInt();
                }
            }
        }

        // Now calculate SGPA for each semester
        System.out.println("\n------- The Progress Report -------\n");

        for (int i = 0; i < sem_count; i++) {
            System.out.println("Semester " + (i + 1) + ":");
            double total_marks = 0;
            double total_weight = 0;
            for (int j = 0; j < sub_count[i]; j++) {
                System.out.println(sub_name[j] + " || Score: " + sub_marks[i][j]);
                if (isWeighted) {
                    total_marks += sub_marks[i][j] * sub_weights[i][j];
                    total_weight += sub_weights[i][j];
                } else {
                    total_marks += sub_marks[i][j];
                }
            }

            if (isWeighted) {
                sem_sgpa[i] = total_marks / total_weight; 
            } else {
                sem_sgpa[i] = total_marks / sub_count[i]; 
            }
            System.out.println("\nSGPA for semester " + (i + 1) + ": " + sem_sgpa[i]);
            cgpa += sem_sgpa[i]; 
            System.out.println("\n-----------------------");
        }

        // Calculate CGPA
        cgpa /= sem_count;
        System.out.println("\nFinal CGPA: " + cgpa);
        System.out.println("\n-----------------------");

        scanner.close();
    }
}
