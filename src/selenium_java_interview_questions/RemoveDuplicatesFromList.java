package selenium_java_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromList {
    public static void main(String args[]){
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(2);
        System.out.println(li);
        int n = li.size();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = li.get(i);
        }
        Arrays.sort(arr);
        List<Integer> li1 = new ArrayList<>();
        int n1 = arr.length;
        li1.add(arr[0]);
        for(int i=1;i<n1;i++){
            if(arr[i]!=arr[i-1]){
                li1.add(arr[i]);
            }
        }
        System.out.println(li1);
    }
}
