package rahulShetty;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        int prod = 1;
        int n = arr.length;
        for(int i=0;i<n;i++){
            prod*=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i] = prod/arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
