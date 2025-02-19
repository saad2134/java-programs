// IMPORTANT: class name must be same as file name.
// EG: FILE.java then 
// class FILE {
// }

public class TypeConversionDemo {
    public static void main(String[] args) {
        // Variable declarations and initializations
        String intInput = args[0];
        String doubleInput = args[1];

        // Parsing string inputs to integer and double
        int intValue = Integer.parseInt(intInput);
        double doubleValue = Double.parseDouble(doubleInput);

        // Implicit type conversion (Widening)
        double widenedValue = intValue; // int to double

        // Explicit type conversion (Narrowing)
        int narrowedValue = (int) doubleValue; // double to int

        // Character and boolean
        char charValue = 'A';
        boolean boolValue = true;

        // Displaying values
        System.out.println("Integer Value: " + intValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Widened Value (int to double): " + widenedValue);
        System.out.println("Narrowed Value (double to int): " + narrowedValue);
        System.out.println("Character Value: " + charValue);
        System.out.println("Boolean Value: " + boolValue);
    }
}

//To execute run following in command line.
//java TakeInput1.java <number>
//java TakeInput1.java 5 7.34
