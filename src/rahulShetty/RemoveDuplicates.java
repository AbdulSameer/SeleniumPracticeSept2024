package rahulShetty;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String args[]){
        int arr[] = {3,7,9,0,1,3,0,4,2,3};
        int n = arr.length;
        int count = 0;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
        int newArray[] = new int[n-count];
        int j = 0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                newArray[j++] = arr[i];
            }
        }
        newArray[j] = arr[n-1];
        System.out.println(Arrays.toString(newArray));
    }
}
