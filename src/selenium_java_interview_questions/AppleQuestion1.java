package selenium_java_interview_questions;

public class AppleQuestion1 {
    public static void main(String args[]){
       // int a =1, b=2, c=a*--b*++a*++b;
        //System.out.println(c);
        int a = 1, b=2;
        int c = b++;
        System.out.println(++b);
    }
}
