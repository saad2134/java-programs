// IMPORTANT: class name must be same as file name.
// EG: FILE.java then 
// class FILE {
// }

public class CheckPrimeNumber {
    public static void main(String[] args) {
        String input = args[0];
        int num = Integer.parseInt(input);
        
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
    
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

//To execute run following in command line.
//java CheckPrimeNumber.java <number>
//java CheckPrimeNumber.java 5
