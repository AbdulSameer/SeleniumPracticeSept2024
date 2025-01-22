package selenium_java_interview_questions;

public class FibonacciSeries {
    public static void main(String args[]){
       /* int n1=0, n2=1, temp=0;
        for(int i=0;i<=10;i++){
            System.out.print(n1+" ");
            temp = n2+n1;
            n1 = n2;
            n2 = temp;
        }*/
        for(int i=0;i<=10;i++){
            System.out.print(fib(i)+" ");
        }
    }
    public static int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int ans = fib(n-1)+fib(n-2);
        return ans;
    }
}
