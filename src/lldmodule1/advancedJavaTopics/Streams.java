package lldmodule1.advancedJavaTopics;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        // create a stream
        int[] numbers = {1,2,3,4,5,6};
        IntStream stream = Arrays.stream(numbers);
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9,10);

        //filter() intermediate
        integerStream
                .map(x -> x*x)
                .filter(y -> y%2==0)
                .forEach(x -> System.out.println(x));


//        Thread t = new Thread( () -> {
//            integerStream
//                    .map(x -> x*x)
//                    .filter(y -> y%2==0)
//                    .forEach(x -> System.out.println(x));
//        });
    }
}
