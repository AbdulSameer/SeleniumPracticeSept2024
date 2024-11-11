package selenium_java_interview_questions;

import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{8,9,4},{7,6,5}};
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0, left = 0, right = cols-1, bottom = rows-1;
        int index = 0;
        int result[] = new int[rows*cols];
        while(left<=right&&top<=bottom){
            for(int i=left;i<=right;i++){
                result[index++] = matrix[top][i];
            }
            top++;

            for(int i=top;i<=bottom;i++){
                result[index++] = matrix[i][right];
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    result[index++] = matrix[bottom][i];
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[index++] = matrix[i][left];
                }
                left++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
