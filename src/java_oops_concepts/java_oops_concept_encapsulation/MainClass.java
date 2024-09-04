package java_oops_concepts.java_oops_concept_encapsulation;

public class MainClass {
    public static void main(String args[]){
        Employee employee = new Employee();
        employee.setEmpName("Sameer");
        employee.setEmpSalary(200000);
        System.out.println("employee name is: "+employee.getEmpName());
        System.out.println("employee salary is: "+employee.getEmpSalary());
    }
}
