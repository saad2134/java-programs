// IMPORTANT: class name must be same as file name.
// EG: FILE.java then 
// class FILE {
// }

class IfElseStatements {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a > b && a > c) {
            System.out.println("The largest number is "+ a);
        }
        else if (b > a && b > c) {
            System.out.println("The largest number is "+ b);
        }
        else {
            System.out.println("The largest number is "+ c);
        }
        

    }
}

//To execute run following in command line.
//java IfElseStatements.java <number1> <number2> <number3>
//java IfElseStatements.java 55 47 78