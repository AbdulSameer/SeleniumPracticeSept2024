package selenium_java_interview_questions;

import java.util.HashMap;

public class WordsRepeatedByUsingHashMap {
    public static void  main(String args[]){
        String word = "Sameer is a genius. Sameer loves watching football. Sameer loves coding";
        HashMap<String,Integer> hm = new HashMap<>();
        String ch[] = word.split(" ");
        for(int i=0;i<ch.length;i++){
            String st = ch[i];
            if(!hm.containsKey(st)){
                hm.put(st,1);
            }else{
                hm.put(st,hm.get(st)+1);
            }
        }
        System.out.println(hm);
    }
}
