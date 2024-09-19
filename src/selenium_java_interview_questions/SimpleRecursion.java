package selenium_java_interview_questions;

public class SimpleRecursion {
    public int recursion(int a){
        if(a>10){
            return 1    ;
        }
        System.out.println(a);
        return recursion(a+1);
    }
    public static void main(String args[]){
        SimpleRecursion sr = new SimpleRecursion();
        int result = sr.recursion(1);
    }
}
