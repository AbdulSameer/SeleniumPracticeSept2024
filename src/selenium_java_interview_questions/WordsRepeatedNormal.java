package selenium_java_interview_questions;

public class WordsRepeatedNormal {
    public static void main(String args[]){
        String word = "Sameer is a genius. Sameer loves watching football. Sameer loves coding";
        String ch [] = word.split(" ");
        for(int i=0;i<ch.length;i++){
            String ch1 = ch[i];
            int count =0;
            for(int j=0;j<ch.length;j++){
                String ch2 =ch[j];
                if(ch1.equalsIgnoreCase(ch2)){
                    count++;
                }
            }
            System.out.println(ch1+" "+count);
        }
    }
}
