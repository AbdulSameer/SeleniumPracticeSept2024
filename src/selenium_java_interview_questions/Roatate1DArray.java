package selenium_java_interview_questions;

import java.util.Arrays;

public class Roatate1DArray {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k=3;
        k = k % n;
        reverseArr(arr,0,n-1);
        reverseArr(arr,0,k-1);
        reverseArr(arr,k,n-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverseArr(int arr[],int start, int end){
        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}
