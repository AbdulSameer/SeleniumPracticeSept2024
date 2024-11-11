package selenium_java_interview_questions;

import java.util.ArrayList;
import java.util.Collections;

public class FactorialOfLargestNumber {
    public static void main(String args[]){
        int N = 10;
        int fact = 1;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i =1;i<=N;i++){
            fact*=i;
        }
        int digit = 0;
        while(fact>0){
            int temp = fact%10;
            digit = temp;
            al.add(digit);
            fact = fact/10;
        }
        Collections.reverse(al);
        for(int a:al){
            System.out.print(a);
        }
    }
}
