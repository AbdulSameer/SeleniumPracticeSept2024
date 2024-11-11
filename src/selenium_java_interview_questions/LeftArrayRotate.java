package selenium_java_interview_questions;

import java.util.Arrays;

public class LeftArrayRotate {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int rotate = 6;
        for(int i=0;i<rotate;i++){
            int first = arr[0];
            for(int j=0;j<n-1;j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = first;
        }
        System.out.println(Arrays.toString(arr));
    }
}
