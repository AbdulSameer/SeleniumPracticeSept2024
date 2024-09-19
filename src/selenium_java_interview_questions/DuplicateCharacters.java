package selenium_java_interview_questions;

public class DuplicateCharacters {
    public static void main(String args[]){
        String name = "saameer";
        int n = name.length();
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=i;j<n;j++){
                if(name.charAt(i)==name.charAt(j)){
                    count++;
                }
            }
            if(count>1){
                System.out.print(name.charAt(i)+" ");
            }
        }
    }
}
