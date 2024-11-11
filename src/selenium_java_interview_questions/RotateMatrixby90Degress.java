package selenium_java_interview_questions;

import java.util.Arrays;

public class RotateMatrixby90Degress {
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int rows = matrix.length;
        int cols = matrix[0].length;

        //Transpose of a matrix
        for(int i=0;i<rows;i++){
            for(int j=i;j<cols;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int[] ele:matrix){
            System.out.println(Arrays.toString(ele));//this gives transpose matrix
            System.out.println("*********************");
        }

        //step2 reverse each row to get the rotate matrix
        for(int i=0;i<rows;i++){
            int start = 0;
            int end = rows-1;
            while(start<end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
        for(int [] ele:matrix){
            System.out.println(Arrays.toString(ele));
        }
    }
}
