package selenium_java_interview_questions;

public class PalindromeString {
    public static void main(String args[]){
        String name = "gadag";
        int n = name.length();
        String ch = "";
        int count = 0;
        for(int i=n-1;i>=0;i--){
            ch = ch+name.charAt(i);
        }
        System.out.println(ch);
        if(name.equals(ch)){
            System.out.println("given string is palindrome");
        }else{
            System.out.println("given string is not palindrome");
        }
    }
}
