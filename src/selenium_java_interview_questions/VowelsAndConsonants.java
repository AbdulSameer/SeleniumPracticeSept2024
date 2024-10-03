package selenium_java_interview_questions;

public class VowelsAndConsonants {
    public static void main(String args[]){
        String name = "my name is sameer";
        int n = name.length();
        int vowelCount = 0;
        int consonantCount = 0;
        for(int i=0;i<n;i++){
            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
                vowelCount++;
            }else{
                consonantCount++;
            }
        }
        System.out.println("vowel count is: "+vowelCount+" and consonant count is: "+consonantCount);
    }
}
