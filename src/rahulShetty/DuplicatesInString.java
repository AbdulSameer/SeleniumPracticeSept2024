package rahulShetty;

import java.util.HashMap;

public class DuplicatesInString {
    public static void main(String args[]){
        String name = "i love football";
        String duplicate = name.replace(" ","");
        int n = duplicate.length();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = duplicate.charAt(i);
            if(!hm.containsKey(ch)){
                hm.put(ch,1);
            }else{
                hm.put(ch,hm.get(ch)+1);
            }
        }
        for(Character key:hm.keySet()){
            if(hm.get(key)>1){
                System.out.println(key);
            }
        }
    }
}
