package selenium_java_interview_questions;

import java.util.ArrayList;
import java.util.List;

public class InnomindsL2ListQuestion {
    public static void main(String args[]){
        List<Integer> li = new ArrayList<>();
        List<Integer> li1 = new ArrayList<>();

        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);

        li1.add(1);
        li1.add(2);
        li1.add(4);

        int n = li.size();
        int m = li1.size();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(li.get(i).equals(li1.get(j))){
                    System.out.println(li.get(i));
                }
            }
        }

    }
}
