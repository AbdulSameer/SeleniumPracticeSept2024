package rahulShetty;

public class PrimeOrNot {
    public static void main(String args[]){
        int n = 49;
        int count = 1;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("given integer is prime");
        }else{
            System.out.println("given integer is not prime");
        }
    }
}
