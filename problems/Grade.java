import java.util.*;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking inpUt
        System.out.println("Enter marks percentage: ");
        int n = sc.nextInt();

        if (n > 100) {
            System.out.println("Wrong marks entered!");
        }
        else if (n > 90) {
            System.out.println("You got an S");
        }
        else if (n > 80) {
            System.out.println("You got an A");
        } 
        else if (n > 70) {
            System.out.println("You got an B");
        } 
        else if (n > 60) {
            System.out.println("You got an C");
        } 

        else if (n > 50) {
            System.out.println("You got an D");
        } 
        else if (n > 40) {
            System.out.println("You got an E");
        } 
        else if (n>0) {
            System.out.println("You have failed!");
        } 
        else {
            System.out.println("Wrong marks entered!");
        } 
    
        

    }
}
