package selenium_java_interview_questions.recursionSeries;

public class ReverseString {
    public static void main(String args[]){
        String name = "sameer";
        recursion(name,name.length()-1);
    }
    public static void recursion(String a, int idx){
        if(idx==0){
            System.out.println(a.charAt(idx));
            return;
        }
        System.out.print(a.charAt(idx));
        recursion(a,idx-1);
    }
}
