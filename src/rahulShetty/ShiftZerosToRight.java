package rahulShetty;

import java.util.Arrays;

public class ShiftZerosToRight {
    public static void main(String args[]){
        int arr[] = { 1, 0, 2, 0, 3, 0, 0, 0 };
        int n = arr.length;
        int newArr[] = new int[n];
        int j = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                newArr[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
