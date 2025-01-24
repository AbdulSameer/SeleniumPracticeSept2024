package tryCatch;

public class TryCatch {
    public static void main(String args[]){
        try{
            int a = 10;
            int b = 0;
            int result = a/b;
        }
        catch (Exception e){
            System.out.println(e.getClass().getName());
            System.out.println(e.getMessage());
        }
    }
}
