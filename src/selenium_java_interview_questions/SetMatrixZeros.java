package selenium_java_interview_questions;

import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,5,6},{7,0,9}};
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRowZero = false, firstColZero = false;
        for(int[] val:matrix){
            System.out.println(Arrays.toString(val));
        }

        System.out.println("********************");
        //check if the first row has any zeros
        for(int i=0;i<rows;i++){
            if(matrix[0][i]==0){
                firstRowZero = true;
                break;
            }
        }

        //check if the first col has any zeros
        for(int i=0;i<cols;i++){
            if(matrix[i][0]==0){
                firstColZero = true;
                break;
            }
        }

        //using first row and first cols as markers for zero rows and cols
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //set rows and cols to zero based on markers

        for(int i=1;i<rows;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<cols;j++){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int i=1;i<cols;i++){
            if(matrix[0][i]==0){
                for(int j=1;j<rows;j++){
                    matrix[j][i] = 0;
                }
            }
        }
        for(int[] ele: matrix){
            System.out.println(Arrays.toString(ele));
        }
    }
}
