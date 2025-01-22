package rahulShetty;

public class FibonnacciSeries {
    public static void main(String args[]){
        int n = 10;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int fib = fibonacci(n-1)+fibonacci(n-2);
        return fib;
    }
}
