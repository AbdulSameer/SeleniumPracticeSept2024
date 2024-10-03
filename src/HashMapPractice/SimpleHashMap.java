package HashMapPractice;

import java.util.HashMap;

public class SimpleHashMap {
    public static void main(String args[]){
        String name = "sameer";
        HashMap<Character, Integer> hm = new HashMap<>();
        int i = 0;
        for(char c: name.toCharArray()) { //toCharArray converts the string into array of characters
          hm.put(c,i);
          i++;
        }
        for(Character key: hm.keySet()){
            System.out.print(key+" ");
        }
        for(Integer value:hm.values()){
            System.out.print(value+" ");
        }
    }
}
