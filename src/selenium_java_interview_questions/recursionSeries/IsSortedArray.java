package selenium_java_interview_questions.recursionSeries;

public class IsSortedArray {
    public static void main(String args[]){
        int arr[] = {1,2,5,4,8};
        System.out.println(isSorted(arr,0));
    }
    public static boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
           return isSorted(arr,idx+1);
        }else{
            return false;
        }
    }
}
