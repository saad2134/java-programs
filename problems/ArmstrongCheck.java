// IMPORTANT: class name must be same as file name.
// EG: FILE.java then 
// class FILE {
// }

public class ArmstrongCheck {
    public static void main(String[] args) {
        String input = args[0];
        int num = Integer.parseInt(input);
        
        int original = num, sum = 0, digits = 0, temp = num;
        
        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }
        
        if (original == sum) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}

//To execute run following in command line.
//java ArmstrongCheck.java <number>
//java ArmstrongCheck.java 153
