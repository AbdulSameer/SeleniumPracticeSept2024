package selenium_java_interview_questions;

public class PalindromeNumber {
    public static void main(String args[]){
        int no = 14641;
        int rev = 0;
        int original = no;
        while(no!=0){
            rev = rev*10+no%10;
            no =  no/10;
        }
        if(original==rev){
            System.out.println("give no  is palindrome");
        }else{
            System.out.println("give no is not palindrome");
        }
    }
}


