package com.Java8more;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionAndBiPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer, String> checkAscii = (x,y) -> x == (int)y.charAt(0);
        System.out.println(checkAscii.test(65,"A"));;

        BiFunction<Integer, Integer, Double> integerDoubleBiFunction = (x,y) -> 0.4 * x * y;
        System.out.println(integerDoubleBiFunction.apply(4,5));
    }
}
