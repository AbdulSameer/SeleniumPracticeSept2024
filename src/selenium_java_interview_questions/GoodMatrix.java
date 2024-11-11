package selenium_java_interview_questions;

import java.util.Arrays;

public class GoodMatrix {
    public static void main(String args[]){
        int matrix[][] = {{1,1,0},{1,1,1},{1,1,1}};
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean row[] = new boolean[rows];
        boolean col[] = new boolean[cols];
        for(int i=0;i<rows;i++){
            for(int j=i;j<cols;j++){
                if(matrix[i][j]==0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        //set the true rows to zero
        for(int i=0;i<rows;i++){
            if(row[i]){
                for(int j=0;j<cols;j++){
                    matrix[i][j] = 0;
                }
            }
        }

        //set the true cols to zero
        for(int j=0;j<cols;j++){
            if(col[j]){
                for(int i=0;i<rows;i++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int[] ele:matrix){
            System.out.println(Arrays.toString(ele));
        }
    }
}
