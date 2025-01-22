package publiciSapient;

import java.util.HashMap;

public class CountOfCharacters {
    public static void main(String args[]){
        String input = "Abdul Sameer";
        HashMap<Character,Integer> hm = new HashMap<>();
        int n = input.length();
        for(int i=0;i<n;i++){
            char ch = input.charAt(i);
            if(ch==' '){
                continue;
            }
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else{
                hm.put(ch,1);
            }
        }
        System.out.println(hm);
    }
}
