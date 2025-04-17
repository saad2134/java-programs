public class MaxArray {

    public static void main(String[] args) {
        int max;
        int arr[] = {12,13,9,4};
        max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println("Max element is " +max);
    }
}