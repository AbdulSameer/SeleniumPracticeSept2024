package rahulShetty;

public class StringReverse {
    public static void main(String args[]){
        String name = "programming";
        int n = name.length();
        char ch;
        String reverse = "";
        for(int i=n-1;i>=0;i--){
            ch = name.charAt(i);
            reverse = reverse+ch;
        }
        System.out.println("Reverse of string given is: "+reverse);
    }
}
