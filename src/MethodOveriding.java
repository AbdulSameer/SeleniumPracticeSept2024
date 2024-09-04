public class MethodOveriding {
    public void empName(String name){
        System.out.println(name);
    }
    public void deptName(String name){
        System.out.println(name);
    }
    public class Manager extends MethodOveriding{
        public void empName(String name){
            System.out.println("manager name: "+name);
        }
        public void deptName(String name){
            System.out.println("dept name: "+name);
        }
    }
    public static void main(String args[]){
        MethodOveriding methodOveriding = new MethodOveriding();
        methodOveriding.empName("sameer");
        methodOveriding.deptName("engineering");
    }
}
