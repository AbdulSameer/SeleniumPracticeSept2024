package rahulShetty;

public class ArmStrong {
    public static void main(String args[]){
        armStrong(153);
    }
    static boolean armStrong(int n){
        if(n==0){
            return true;
        }
        int ans = 0;
        int dup = n;
        int original = n;
        int count = 0;
        while(n>0){
            n=n/10;
            count++;
        }
        while(dup>0){
            int temp = dup%10;
            int add = (int) Math.pow(temp,count);
            ans =  ans+add;
            dup = dup/10;
        }
        if(ans == original){
            System.out.println("Given number is armstrong");
            return true;
        }
        System.out.println("given number is not armstrong");
        return false;
    }
}
