package tryCatch;

public class MultipleTry {
    public static void main(String args[]){
        try{
            int a = 10;
            int b = 0;
            int c = a/b;
        }
        catch (Exception e){
            System.out.println(e.getClass().getName());
            System.out.println(e.getMessage());
        }
        try{
            int a[] = new int[3];
            a[0] = 1;
            a[1] = 2;
            a[3] = 3;
            a[4] = 4;
        }
        catch (Exception e){
            System.out.println(e.getClass().getName());
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("multiple try catch blocks executed");
        }
    }
}
