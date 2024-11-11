package selenium_java_interview_questions;

import java.util.Arrays;

public class PutZerosInEnd {
    public static void main(String args[]){
        int arr[] = {2,3,0,5,0,0,7};
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println("length of the array: "+n);
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        int i = 0, k = -1;
        int ans[] = new int[n];
        while(n-(count-k)<n){
            ans[i] = arr[n-(count-k)];
            k++;
            i++;
        }
        int j = 0;
        while(i<n){
            ans[i] = arr[j];
            j++;
            i++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
