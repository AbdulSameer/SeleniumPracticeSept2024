package selenium_java_interview_questions;

import java.util.Arrays;

public class RemoveDuplicateCharactersFromArray {
    public static void main(String args[]){
        int arr[] = {4,7,9,10,7,1,43,4};
        int n = arr.length;
        Arrays.sort(arr);//i can use bubble sort for this
        int j =0;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
