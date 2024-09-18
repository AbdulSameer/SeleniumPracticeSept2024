package selenium_java_interview_questions;

import java.util.Arrays;

public class RemoveDuplicateIntegersFromArray {
    public static void main(String args[]){
        int arr[] = {1,1,2,2,3,3,4,4,4,4};
        int n = arr.length;
        Arrays.sort(arr);
        int count = 1;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                count++;
            }
        }
        System.out.println(count);
        int arr1[] = new int[count];
        int j = 0;
        arr1[j++] = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                arr1[j++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
