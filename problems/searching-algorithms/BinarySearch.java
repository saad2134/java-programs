// IMPORTANT: class name must be same as file name.
// EG: FILE.java then 
// class FILE {
// }

public class BinarySearch {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50};
        int key = Integer.parseInt(args[0]);
        
        int left = 0, right = arr.length - 1;
        int index = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
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
//java BinarySearch.java <number>
//java BinarySearch.java 30
