package selenium_java_interview_questions;

public class OracleJavaInterviewQuestion {
    public static void main(String args[]){
        String name = "my name is sameer";
        int count = 0;
        String ch = "";
        int n = name.length();

        //taking space count
        for(int i=0;i<n;i++){
            if(name.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("count of spaces is: "+count);

        //initializing the array to get indices of the spaces from the string
        int arr[] = new int[count];
        int index = 0;
        for(int i=0;i<n;i++){
            if(name.charAt(i)==' '){
                arr[index] = i;
                index++;
            }
        }

        //reversing the original string
        for(int i=n-1;i>=0;i--){
            ch +=  name.charAt(i);
        }
        System.out.println(ch);

        String nameWithoutSpaces = ch.replace(" ","");
        System.out.println("string without spaces: "+nameWithoutSpaces);
        StringBuilder builder = new StringBuilder(nameWithoutSpaces);
        index = 0;
        for(int i=0;i<count;i++){
            builder.insert(arr[i]," ");
        }
        System.out.println("output is: "+builder);
    }
}
