package selenium_java_interview_questions;

public class DiverseCharacters {
    public static void main(String args[]){
        String name = "sameer1234";
        int n = name.length();
        int stringCount = 0;
        int intCount = 0;
        for(int i=0;i<n;i++){
            int c = (int)name.charAt(i);
            if(c>=65&&c<=90||c>=97&&c<=122){
                stringCount++;
            }else{
                intCount++;
            }
        }
        if(stringCount>intCount){
            System.out.println("String has more characters: "+stringCount);
        }else{
            System.out.println("int has more characters");
        }
    }
}
