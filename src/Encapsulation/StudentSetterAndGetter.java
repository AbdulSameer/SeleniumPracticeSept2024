package Encapsulation;

public class StudentSetterAndGetter {
    private String name;
    private int age;

    //getter Methods
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    //setterMethods
    public void setName(String name){
        if(name!=null){
            this.name = name;
        }else{
            System.out.println("invalid name");
        }
    }

    public void setAge(int age){
        if(age>0){
            this.age = age;
        }else{
            System.out.println("invalid age");
        }
    }

}
