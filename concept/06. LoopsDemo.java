// IMPORTANT: class name must be same as file name.
// EG: FILE.java then 
// class FILE {
// }

public class LoopsDemo {
    public static void main(String[] args) {
        String input = args[0];
        int n = Integer.parseInt(input);

        System.out.println("For Loop:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("While Loop:");
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        System.out.println("Do-While Loop:");
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);
        System.out.println();
    }
}

//To execute run following in command line.
//java LoopsDemo.java <number>
//java LoopsDemo.java 5
