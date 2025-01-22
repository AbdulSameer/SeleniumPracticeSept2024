package rahulShetty;

public class SumOfDigits {
    public static void main(String args[]){
        int n = 786;
        int count = 0;
        while(n>0){
            int temp = n%10;
            count+=temp;
            n = n/10;
        }
        System.out.println(count);
    }
}
