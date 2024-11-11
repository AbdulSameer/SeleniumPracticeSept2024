package selenium_java_interview_questions;

public class MergeSort {
    public static void main(String args[]) {
        int arr[] = {3, 7, 1, 4, 11, 20, 0};
        mSort(arr, 0, arr.length - 1);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void mSort(int[] arr, int i, int j) {
        if (i < j) {
            int mid = (i + j) / 2;
            mSort(arr, i, mid);
            mSort(arr, mid + 1, j);
            merge(arr, i, mid, j);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int[] b = new int[arr.length];

        // Merge the two halves into auxiliary array `b`
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                b[k++] = arr[i++];
            } else {
                b[k++] = arr[j++];
            }
        }

        // Copy remaining elements from the left half, if any
        while (i <= mid) {
            b[k++] = arr[i++];
        }

        // Copy remaining elements from the right half, if any
        while (j <= high) {
            b[k++] = arr[j++];
        }

        // Copy the sorted elements back into original array
        for (i = low; i <= high; i++) {
            arr[i] = b[i];
        }
    }
}
