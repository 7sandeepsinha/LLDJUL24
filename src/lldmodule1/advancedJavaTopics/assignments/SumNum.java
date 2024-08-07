package lldmodule1.advancedJavaTopics.assignments;

import java.util.List;
import java.util.stream.Stream;

public class SumNum {

    static int getSum(Stream<Integer> stream){
        // write code here
        return stream.reduce(0,Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5,6,7,8,9);
        System.out.println(getSum(list.stream()));

    }
}
