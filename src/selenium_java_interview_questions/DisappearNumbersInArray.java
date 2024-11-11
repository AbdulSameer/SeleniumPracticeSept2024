package selenium_java_interview_questions;

import java.util.Arrays;

public class DisappearNumbersInArray {
    public static void main(String args[]){
        int arr[] =  {4,3,2,7,8,2,3,1};
        int n = arr.length;
        boolean isPresent[] = new boolean[n];
        for(int i=0;i<n;i++){
            isPresent[arr[i]-1] = true;
        }
        System.out.println(Arrays.toString(isPresent));
    }
}
