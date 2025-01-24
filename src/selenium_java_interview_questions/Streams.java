package selenium_java_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String args[]){
        List<Integer> li = Arrays.asList(1,5,7,9,23);
        li.stream().filter(n->n>10).forEach(System.out::println);
        li.stream().map(n->n*2).forEach(n -> System.out.print(n + " "));

    }
}
