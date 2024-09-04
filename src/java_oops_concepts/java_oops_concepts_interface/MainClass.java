package java_oops_concepts.java_oops_concepts_interface;

public class MainClass implements Interface1{
    public static void main(String args[]){
        MainClass object = new MainClass();
        object.employeeDepartment("Engineering");
        object.employeeName("Sameer",200000);
    }

        public void employeeName(String name, int salary) {
            System.out.println("employee name is: "+name+" and salary is: "+salary);
    }
}
