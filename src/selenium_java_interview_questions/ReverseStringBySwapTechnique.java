package selenium_java_interview_questions;

public class ReverseStringBySwapTechnique {

    public static void main(String args[]){
        String name = "hi my name is sameer";
        int n = name.length();
        char ch[] = name.toCharArray();
        for(int i=0;i<n/2;i++){
            char temp = ch[i];
            ch[i] = ch[n-i-1];
            ch[n-i-1] = temp;
        }
        System.out.println(new String(ch));
    }
}
