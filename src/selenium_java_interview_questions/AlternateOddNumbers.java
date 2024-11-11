package selenium_java_interview_questions;

public class AlternateOddNumbers {
    public static void main(String args[]){
        int n = 100;
        if(n%2==0){
            n--;
        }
        while(n>=100){

                System.out.print(" "+n);

            n-=4;
        }
    }
}
