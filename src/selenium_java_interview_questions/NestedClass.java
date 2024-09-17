package selenium_java_interview_questions;

public class NestedClass {
    public static void main(String args[]){
        System.out.println("this is main class");
        NestedClassOne one = new NestedClassOne();
        NestedClassOne.main(args);
    }

    public static class NestedClassOne{
        public static void main(String args[]){
            System.out.println("this is second class or nested class");
        }
    }
}
