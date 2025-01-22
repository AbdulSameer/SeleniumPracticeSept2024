package rahulShetty;

public class MaximumConsecutiveOnes {
    public static void main(String args[]){
        int[] array = { 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1 };
        int n = array.length;
        int count = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            if(array[i]==1){
                count++;
            }else{
                count = 0;
            }
            max = Math.max(count, max);
        }
        System.out.println(max);
    }
}
