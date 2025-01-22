package selenium_java_interview_questions.recursionSeries;

public class PowerCalculation {
    public static void main(String args[]){
        int ans =power(2,5);
        System.out.println(ans);
    }
    public static int power(int a, int n){
        if(n==0){
            return 1;
        }
        if(a==1){
            return 0;
        }
        int ans = a*power(a,n-1);
        return ans;
    }
}
