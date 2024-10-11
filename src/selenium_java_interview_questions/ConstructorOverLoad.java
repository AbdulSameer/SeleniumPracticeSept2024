package selenium_java_interview_questions;

public class ConstructorOverLoad {
    ConstructorOverLoad(){
        System.out.println("This is default constructor");
    }
    ConstructorOverLoad(String name){
        System.out.println("This is constructor overload-1");
        System.out.println(name);
    }
    public void nonStaticMethod(){
         int age = 10;
        System.out.println(age);
    }
    public static void main(String args[]){
        ConstructorOverLoad defaultConstructor = new ConstructorOverLoad();
        ConstructorOverLoad col = new ConstructorOverLoad("Sameer");
        col.nonStaticMethod();
    }
}
