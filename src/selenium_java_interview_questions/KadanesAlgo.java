package selenium_java_interview_questions;

public class KadanesAlgo {
    public static void main(String args[]){
        int arr[] = {3,7,-4,9,2,4};
        int n = arr.length;
        /*int ans = 0;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=i;j<n;j++){
                count += arr[j];
                ans = Math.max(count, ans);
            }
        }*/
        int max1 = arr[0];
        int max2 = arr[0];
        for(int i=1;i<n;i++){
            max2 = Math.max(arr[i], arr[i]+max2);
            max1 = Math.max(max1, max2);

        }
        System.out.println(max1);
    }
}
