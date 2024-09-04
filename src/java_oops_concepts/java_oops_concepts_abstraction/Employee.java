package java_oops_concepts.java_oops_concepts_abstraction;

public abstract class Employee {
    public void employeeName(String empName){
        System.out.println("employee name is: "+empName);
    }

    public abstract void employeeDepartment(String department);
}
