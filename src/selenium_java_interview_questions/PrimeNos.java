package selenium_java_interview_questions;

public interface PrimeNos {
    public static void main(String args[]){
        int n =100;
        System.out.println("prime no's are: ");
        for(int i=2;i<=n;i++){
            int count = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }
        }
    }
}
