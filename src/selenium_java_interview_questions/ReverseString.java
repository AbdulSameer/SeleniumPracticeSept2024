package selenium_java_interview_questions;

public class ReverseString {
    public static void main(String args[]){
        String name = "welcome";
        int n = name.length();
        String rev = "";
        for(int i=n-1;i>=0;i--){
            rev = rev+name.charAt(i);
        }
        System.out.println(rev);
    }
}
