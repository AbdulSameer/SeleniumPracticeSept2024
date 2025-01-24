package interfacesPackage;

public class FunctionalInterfaceExample {
    public static void main(String args[]){
        MyFunctionalInterface myFunc = ()-> System.out.println("Hello, this is functional interface");
        myFunc.sayHello();
    }
}
