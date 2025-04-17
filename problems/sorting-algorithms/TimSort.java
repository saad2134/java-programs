import java.util.Arrays;

public class TimSort {
    private static final int RUN = 32;

    public static void main(String[] args) {
        int[] arr = {5, 21, 7, 23, 19};
        timSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void timSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i += RUN) {
            insertionSort(arr, i, Math.min((i + RUN - 1), (n - 1)));
        }

        for (int size = RUN; size < n; size = 2 * size) {
            for (int left = 0; left < n; left += 2 * size) {
                int right = Math.min(n - 1, left + 2 * size - 1);
                int mid = Math.min(n - 1, left + size - 1);
                merge(arr, left, mid, right);
            }
        }
    }

    public static void insertionSort(int[] arr, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= left && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int len1 = mid - left + 1, len2 = right - mid;
        int[] leftArray = new int[len1];
        int[] rightArray = new int[len2];

        System.arraycopy(arr, left, leftArray, 0, len1);
        System.arraycopy(arr, mid + 1, rightArray, 0, len2);

        int i = 0, j = 0, k = left;
        while (i < len1 && j < len2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < len1) {
            arr[k++] = leftArray[i++];
        }

        while (j < len2) {
            arr[k++] = rightArray[j++];
        }
    }
}
