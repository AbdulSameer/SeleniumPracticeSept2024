package selenium_java_interview_questions;


import java.util.HashMap;

public class OccurenceOfCharacterInArray {
    public static void main(String args[]) {
        char ch[] = {'a', 'b', 'c', 'b', 'a', 'a', 'd'};
        int n = ch.length;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = ch[i];
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else
                hm.put(c, 1);
        }

        System.out.println(hm);
    }
}
