package selenium_java_interview_questions;

public class NextGreaterElement {
    public static void main(String args[]){
        int n = 21;
        int original = n;
        if(n<10){
            System.out.println(false);
        }
        int rev = 0;
        while(n!=0){
            rev = rev*10+n%10;
            n = n/10;
        }
        if(rev>original){
            System.out.println("next greater element: "+rev);
        }
        System.out.println(false);
    }
}
