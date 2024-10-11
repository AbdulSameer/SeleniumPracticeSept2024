package selenium_java_interview_questions.accessModifiers.protectedPackage;

public class Animal {
    protected String name;
    protected void showName(){
        System.out.println("Name: "+name);
    }
}

//A member with protected access can be accessed within its own class, by classes in the same package, and by subclasses (even if they are in different packages).