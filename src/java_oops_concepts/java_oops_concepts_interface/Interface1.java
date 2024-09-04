package java_oops_concepts.java_oops_concepts_interface;

public interface Interface1 {
    public default void employeeDepartment(String deptName){
        System.out.println("employee department name is: "+deptName);
    }
    void employeeName(String name, int salary);
}
