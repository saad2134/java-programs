// IMPORTANT: class name must be same as file name.
// EG: FILE.java then 
// class FILE {
// }

public class LinearSearch {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50};
        int key = Integer.parseInt(args[0]);
        
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}

//To execute run following in command line.
//java LinearSearch.java <number>
//java LinearSearch.java 30
