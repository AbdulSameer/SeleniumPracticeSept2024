package selenium_java_interview_questions;

public class ReverseString {
    public static void main(String args[]){
        String name = "welcome";
        int n = name.length();
        char ch;
        String rev="";
        for(int i=n-1;i>=0;i--){
            ch = name.charAt(i);
            rev = rev+ch;
        }
        System.out.println(rev);
    }
}
