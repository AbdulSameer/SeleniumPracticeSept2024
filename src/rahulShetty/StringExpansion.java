package rahulShetty;

public class StringExpansion {
    public static void main(String args[]){
        String name = "a2b3c4";
        System.out.println(expandString(name));
    }
    public static String expandString(String name){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch>=48&&ch<=57){
                int count = ch-'0';
                char previousChar = name.charAt(i-1);
                for(int j=0;j<count;j++){
                    sb.append(previousChar);
                }
            }
        }
        return sb.toString();
    }
}
