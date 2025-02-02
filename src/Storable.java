public class Storable {
    public static void main(String args[]){
        String input = "abdul";
        int n = input.length();
        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            char ch = input.charAt(i);
            for(int j=0;j<=i;j++){
                sb.append(ch);
            }
            System.out.print(sb.toString());
        }
    }
}
