package selenium_java_interview_questions;

class Test{

    public void m1(String s){
        System.out.print("String version");
    }

    public void m1(Object o){
        System.out.print("Object version");
    }

    public static void main(String[] args){

        Test t = new Test();
        t.m1(null);
    }
}
