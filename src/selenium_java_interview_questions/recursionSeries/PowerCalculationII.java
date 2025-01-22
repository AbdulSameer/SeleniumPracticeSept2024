package selenium_java_interview_questions.recursionSeries;

public class PowerCalculationII {
    public static void main(String args[]){
        int ans = power(2,5);
        System.out.println(ans);
    }
    public static int power(int a, int n){
        if(n==0){
            return 1;
        }
        if(a==0){
            return 0;
        }
        if(n%2==0){
            return power(a,n/2)*power(a,n/2);
        }else{
            return power(a,n/2)*power(a,n/2)*a;
        }
    }
}
