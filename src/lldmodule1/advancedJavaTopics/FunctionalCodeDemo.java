package lldmodule1.advancedJavaTopics;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalCodeDemo {
    public static void main(String[] args) {
        // Function<T,E> T as i/p, E as return type

        Function<Integer, Double> square = a -> Math.pow(a, 2);
        calculate(square, 4);

        Predicate<Integer> checkEven = a -> a%2 == 0;
        predicateDemo(checkEven, 10);

        Supplier<String> getLogData = () -> "Logging information";
        supplierDemo(getLogData);

        Consumer<String> annotateAndPrint = a -> System.out.println("Hello : " + a);
        consumerDemo(annotateAndPrint, "World");
    }

    public static void calculate(Function<Integer, Double> function, int a){
        System.out.println(function.apply(a)); // apply will call the lambda expression
    }

    public static void predicateDemo(Predicate<Integer> predicate, int a){
        System.out.println(predicate.test(a));
    }

    public static void supplierDemo(Supplier<String> supplier){
        System.out.println(supplier.get());
    }

    public static void consumerDemo(Consumer<String> consumer, String str){
        consumer.accept(str);
    }
}
