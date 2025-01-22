package publiciSapient;

public class AlphaNumeric {
    public static void main(String args[]){
        String input = "aabcccddd";
        int n = input.length();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=1;i<n;i++){
            if(input.charAt(i)==input.charAt(i-1)){
                count++;
            }else{
                sb.append(input.charAt(i-1)).append(count);
                count = 1;
            }
        }
        sb.append(input.charAt(n-1)).append(count);
        System.out.println(sb.toString());
    }
}
