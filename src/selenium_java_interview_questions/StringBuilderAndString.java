package selenium_java_interview_questions;

public class StringBuilderAndString {
    public static void main(String args[]){
        String firstName = "abdul";
        firstName.concat("sameer");
        System.out.println(firstName);//output will be abdul

        StringBuilder builder = new StringBuilder("abdul");
        builder.append(" "+"sameer");
        System.out.println(builder);

    }
}
