package com.Java8more;

import java.io.BufferedReader;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionAndPredicate {
    public static void main(String[] args) {
        int i=5;
        //We can use local variable in lambda function but cannot change it as it considered as final in lambda function
        Function<Integer,Integer> function = a -> { return a+i;}; //{i++; return a+1;};
        System.out.println(function.apply(4) + " " + i);

        Predicate<String> checkLength = x -> x.length() >= 5;
        System.out.println("Length greater than 5 is " + checkLength.test("code"));

//        final StringBuffer bf = new StringBuffer("afs");
//        System.out.println(bf);
//        bf.append("hello");
//        System.out.println(bf);

        //FunctionalChaining
        Function<Integer, Integer> doubleIt = x -> x*2;
        System.out.println("Double" + doubleIt.apply(2));

        Function<Integer, Integer> cubeIt = x -> (int)Math.pow(x, 3);
        System.out.println("Cube" + cubeIt.apply(2));

        System.out.println("First doubling using andThen " + doubleIt.andThen(cubeIt).apply(2));  //I think its better and I have to use only this if required
        System.out.println("First cubing using compose " + doubleIt.compose(cubeIt).apply(2));


    }
}
