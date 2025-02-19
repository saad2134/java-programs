// IMPORTANT: class name must be same as file name.
// EG: FILE.java then 
// class FILE {
// }

public class ArrayRev {
    public static void main(String args[]) {
        int arr[] = {23, 24, 45, 61, 81};
        int arrrev[] = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            arrrev[i] = arr[arr.length - 1 - i];
        }
        
        System.out.print("Reversed Array: ");
        for (int num : arrrev) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

//To execute run following in command line.
//java ArrayRev.java
