package selenium_java_interview_questions.sortings;

import java.util.Arrays;

public class Selection {
    public static void main(String args[]){
        int arr [] = {11,2,9,7,1,3};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIdx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
