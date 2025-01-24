package tryCatch;

public class CustomTryCatch {
    public static void main(String args[]){
        try{
            validateAge(15);
        }
        catch(CustomException e){
            //System.out.println(e.getClass().getName());
            System.out.println(e.getMessage());
        }
    }
    public static void validateAge(int age) throws CustomException{
        age = 10;
        if(age<18){
            throw new CustomException("Age should be above 18");
        }
        System.out.println("Valid age");
    }
}
