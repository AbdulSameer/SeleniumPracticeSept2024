package rahulShetty;

import java.util.Arrays;

public class SecondLargestNumberInArray {
    public static void main(String args[]){
        int arr[] = {4,7,9,1,3};
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("second largest number is: "+arr[n-2]);
    }
}
