// IMPORTANT: class name must be same as file name.
// EG: FILE.java then 
// class FILE {
// }

public class SwitchCaseDemo {
    public static void main(String[] args) {
        String input = args[0];
        int choice = Integer.parseInt(input);

        switch (choice) {
            case 1:
                System.out.println("You selected option 1");
                break;
            case 2:
                System.out.println("You selected option 2");
                break;
            case 3:
                System.out.println("You selected option 3");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}

//To execute run following in command line.
//java SwitchCaseDemo.java <number>
//java SwitchCaseDemo.java 1
