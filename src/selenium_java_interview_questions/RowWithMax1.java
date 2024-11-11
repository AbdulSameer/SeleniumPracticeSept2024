package selenium_java_interview_questions;

import java.util.Arrays;

public class RowWithMax1 {
    public static void main(String args[]){
        int arr[][] = {{0,1,1,1},{0,0,1,1,},{1,1,1,1},{0,0,0,0}};
        int rows = arr.length;
        int cols = arr[0].length;
        int max[] = new int[rows];
        for(int i=0;i<rows;i++){
            int count = 0;
            for(int j=0;j<cols;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            max[i] = count;
        }
        System.out.println(Arrays.toString(max));
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<max.length;i++){
            if(max[i]>ans){
                ans = i;
            }
        }
        System.out.println();
    }
}
