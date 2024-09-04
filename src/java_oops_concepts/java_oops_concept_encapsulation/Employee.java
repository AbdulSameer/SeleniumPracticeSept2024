package java_oops_concepts.java_oops_concept_encapsulation;

public class Employee {
    private String empName;
    private int empSalary;

    public String getEmpName(){
        return empName;
    }

    public int getEmpSalary(){
        return empSalary;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSalary(int empSalary){
        this.empSalary = empSalary;
    }
}
