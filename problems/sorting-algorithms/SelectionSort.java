// IMPORTANT: class name must be same as file name.
// EG: FILE.java then 
// class FILE {
// }

public class SelectionSort {
    public static void main(String args[]) {
        int arr[] = {64, 25, 12, 22, 11};
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

//To execute run following in command line.
//java SelectionSort.java
