import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class DeclareArrayList extends Colors {
    public static void main(String args[]){
        ArrayList arr = new ArrayList();
        arr.add("apple");
        arr.add("Banana");
        arr.add("Water melon");
        arr.add("Mango");

        System.out.println(BLUE + "--Print Array Using For  Loop-----------------------------------------------------------------" );
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        System.out.println(RED + "--Print Array Using For  Loop-----------------------------------------------------------------" );
        for(Object s:arr){
            System.out.println(s);
        }

        System.out.println(GREEN + "--Print Array Using For  Loop-----------------------------------------------------------------" );
        System.out.println(arr);
    }
}
