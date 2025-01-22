package selenium_java_interview_questions.sortings;

import java.util.Arrays;

import static selenium_java_interview_questions.MergeSort.merge;

public class Merge {
    public static void main(String args[]) {
        int arr[] = {11, 2, 9, 7, 1, 3};
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            //sorting left half
            mergeSort(arr, left, mid);
            //sorting right half
            mergeSort(arr, mid + 1, right);
            //merging both halves
            merge(arr, left, mid, right);
        }
    }
        private static void merge ( int arr[], int left, int mid, int right){
            //dividing the array into two halves
            int a1[] = new int[mid - left + 1];
            int a2[] = new int[right - mid];

            //taking left(a1)elements
            for (int i = left; i <=mid; i++) {
                a1[i - left] = arr[i];
            }

            //taking other half elements
            for (int i = mid + 1; i <= right; i++) {
                a2[i - mid - 1] = arr[i];
            }
            int i = 0, j = 0, k = left;
            //merging the elements
            while (i < a1.length && j < a2.length) {
                if (a1[i] <= a2[j]) {
                    arr[k++] = a1[i++];
                } else {
                    arr[k++] = a2[j++];
                }
            }

            //checking if any elements left
            while (i < a1.length) {
                arr[k++] = a1[i++];
            }
            while (j < a2.length) {
                arr[k++] = a2[j++];
            }
        }
    }

