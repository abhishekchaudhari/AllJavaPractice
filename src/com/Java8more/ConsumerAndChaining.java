package com.Java8more;
import java.util.function.Consumer;
public class ConsumerAndChaining {
    public static void main(String[] args){
        Consumer<Integer> consumer = x -> System.out.println("Double of consumed value: " + x*2);
        consumer.accept(5);
        Consumer<Integer> consumer1 = x -> System.out.println("Cube of consumed value: " + x*x*x);
        consumer1.accept(5);

        consumer.andThen(consumer1).accept(5);
        //Consumer doesnt hava compose method
    }
}
