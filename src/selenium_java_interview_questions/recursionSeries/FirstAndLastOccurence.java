package selenium_java_interview_questions.recursionSeries;

public class FirstAndLastOccurence {
    public static int first = -1;
    public static int last  = -1;
    public static void main(String args[]){
        String name = "baacdaefaah";
        falo(name,0,'a');

    }
    public static void falo(String s,int idx,char element){
        if(idx==s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = s.charAt(idx);
        if(currChar==element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        falo(s,idx+1,element);
    }
}
