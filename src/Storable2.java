public class Storable2 {
    public static void main(String args[]){
        String input = "a5b2c3d4";
        int n = input.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = input.charAt(i);
            if(ch>=97&&ch<=122){
                char letter = ch;
                i++;
                char numChar = input.charAt(i);
                int num = numChar - '0';

                for(int j=0;j<num;j++){
                    sb.append(letter);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
