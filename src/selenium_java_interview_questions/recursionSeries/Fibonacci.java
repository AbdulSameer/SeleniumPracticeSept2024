package selenium_java_interview_questions.recursionSeries;

public class Fibonacci {
    public static void main(String args[]){
        int n = 10;
        for(int i=0;i<n;i++){
            System.out.print(fibon(i)+" ");
        }
    }
    public static int fibon(int n){
        if(n<=1){
            return n;
        }
        return fibon(n-1)+fibon(n-2);
    }
}
