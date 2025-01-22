package rahulShetty;

import java.util.HashMap;

public class CountNoOfCharacters {
    public static void main(String args[]){
        String name = "i love football";
        HashMap<Character,Integer> hm = new HashMap<>();
        String duplicate = name.replace(" ","");
        int n = duplicate.length();
        for(int i=0;i<n;i++){
            char ch = duplicate.charAt(i);
            if(!hm.containsKey(ch)){
                hm.put(ch,1);
            }else{
                hm.put(ch,hm.get(ch)+1);
            }
        }
        System.out.println(hm);
    }
}
