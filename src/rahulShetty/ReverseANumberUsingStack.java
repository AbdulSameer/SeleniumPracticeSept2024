package rahulShetty;

import java.util.Stack;

public class ReverseANumberUsingStack {
    public static void main(String args[]){
        int n = 1234;
        Stack<Integer> stack = new Stack<>();
        while (n > 0) {
            stack.push(n % 10);  // Push the last digit of n
            n = n / 10;          // Remove the last digit from n
        }
        int reverse = 0;
        int place = 1;
        while(!stack.isEmpty()){
            reverse+=stack.pop()*place;
            place*=10;
        }
        System.out.println(reverse);
    }
}
