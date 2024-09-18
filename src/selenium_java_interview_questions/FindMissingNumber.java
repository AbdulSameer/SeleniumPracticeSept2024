package selenium_java_interview_questions;

import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String args[]){
        int arr[] = {4,5,6,2,7};
        Arrays.sort(arr);
        int n = arr.length;
        int ans = 0;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]+1){
                ans = arr[i]-1;
            }
        }
        System.out.println(ans);
    }
}
