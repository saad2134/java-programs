import java.util.Arrays;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args) {
        double[] arr = {0.42, 0.32, 0.23, 0.73, 0.61, 0.52};
        bucketSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bucketSort(double[] arr) {
        if (arr.length <= 1) return;

        int n = arr.length;
        @SuppressWarnings("unchecked")
        java.util.List<Double>[] buckets = new java.util.List[n];

        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (arr[i] * n);
            if (buckets[bucketIndex] == null) {
                buckets[bucketIndex] = new java.util.ArrayList<>();
            }
            buckets[bucketIndex].add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            if (buckets[i] != null) {
                Collections.sort(buckets[i]);
            }
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            if (buckets[i] != null) {
                for (double value : buckets[i]) {
                    arr[index++] = value;
                }
            }
        }
    }
}
