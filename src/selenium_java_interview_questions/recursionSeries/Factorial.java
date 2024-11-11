package selenium_java_interview_questions.recursionSeries;

import org.testng.annotations.IFactoryAnnotation;

public class Factorial {
    public static void main(String args[]){
        System.out.println(fact(5));
    }
    public static int fact(int n){
        if(n==1||n==0){
            return 1;
        }
        int factN = n*fact(n-1);
        return factN;
    }
}
