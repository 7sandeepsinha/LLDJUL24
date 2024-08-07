package lldmodule1.advancedJavaTopics.assignments;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddNum {

    static List<Integer> getOdd(Stream<Integer> stream){
        // write code here
       return stream.filter(n->n%2==1)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
       List<Integer>list=List.of(1,2,3,4,5,6,7,8,9);
       System.out.println(getOdd(list.stream()));
    }
}
