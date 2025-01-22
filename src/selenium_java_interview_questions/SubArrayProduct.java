package selenium_java_interview_questions;

public class SubArrayProduct {
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        int k = 10;
        int n = arr.length;
        int count = 0;
        int mul;
        for(int i=0;i<n;i++){
            if(arr[i]<k){
                count++;
            }
            mul = arr[i];
            for(int j=1+1;j<n;j++){
                mul*=arr[j];
                if(mul<k){
                    count++;
                }else{
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
