package selenium_java_interview_questions.sortings;

import java.util.Arrays;

public class Insertion {
    public static void main(String args[]){
        int arr[] = {11,2,9,7,1,3};
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
