package selenium_java_interview_questions;

import java.util.Arrays;

public class RightRotateArray {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int rotate = 6;
        for(int i=0;i<rotate;i++){
            int last = arr[n-1];
            for(int j = n-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        System.out.println(Arrays.toString(arr));
    }
}
