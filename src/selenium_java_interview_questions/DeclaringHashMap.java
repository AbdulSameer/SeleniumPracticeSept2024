package selenium_java_interview_questions;

import java.util.HashMap;

public class DeclaringHashMap {
    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("Apple",5);
        hm.put("Mango",10);
        hm.put("Oranges",20);
        hm.put("Water Melon",15);
        System.out.println(hm.keySet());
        for(String k:hm.keySet()){
            System.out.println(hm.get(k));
        }
        
    }
}
