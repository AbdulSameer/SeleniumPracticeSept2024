package selenium_java_interview_questions;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharactersUnique {
    public static void main(String args[]){
        String name = "sameer";
        int n = name.length();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = name.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else{
                hm.put(ch,1);
            }
        }
        System.out.println(hm);
        for(Map.Entry<Character,Integer> mp: hm.entrySet()){
            if(mp.getValue()==1){
                System.out.print(mp.getKey()+" ");
            }
        }
    }
}
