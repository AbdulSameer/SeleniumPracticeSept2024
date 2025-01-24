package Encapsulation;

public class EncapsExample {
    public static void main(String args[]){
        StudentSetterAndGetter student = new StudentSetterAndGetter();
        student.setName("Sameer");
        student.setAge(30);
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
