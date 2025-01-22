package rahulShetty;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String args[]) {
        String name = "sameers";
        int n = name.length();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = name.charAt(i);
            if (!hm.containsKey(ch)) {
                hm.put(ch, 1);
            } else {
                hm.put(ch, hm.get(ch) + 1);
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            char ch = name.charAt(i);
            if(hm.get(ch) == 1) {
                count++;
                if(count == 2) {
                    System.out.println("Second non-repeating character: " + ch);
                    return;  // Exit once the second non-repeating character is found
                }
            }
        }
    }
}
