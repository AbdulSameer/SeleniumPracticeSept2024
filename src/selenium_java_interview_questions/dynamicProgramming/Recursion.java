package selenium_java_interview_questions.dynamicProgramming;

import java.util.Arrays;

public class Recursion {
    public static void main(String args[]){
        int n = 10;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println("fibonacci of "+ n +" is "+fib(n,dp));
    }
    static int fib(int n, int dp[]){
        //base case
        if(n<=1){
            return n;
        }
        //if dp is already calculated
        if(dp[n]!=-1){
            return dp[n];
        }
        //compute and store the result
        dp[n] = fib(n-1,dp)+fib(n-2,dp);
        return dp[n];
    }
}
