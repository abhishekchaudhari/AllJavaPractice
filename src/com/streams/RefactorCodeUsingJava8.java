package com.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RefactorCodeUsingJava8 {
    public static void main(String[] args) {
        List<Double> list = Stream.iterate(1, x -> x+1)
                        .filter(RefactorCodeUsingJava8::isPrime).peek(System.out::println)
                                .map(Math::sqrt).limit(10).collect(Collectors.toList());
        System.out.println(isPrime(7));
        System.out.println(list);
    }

    public static boolean isPrime(int num){
        return num>1 && IntStream.range(2,num).noneMatch(n -> num%n == 0);
    }
//    public static boolean isPrime(int num){
//        boolean isDivisible = false;
//        for(int i=2; i<num; i++){
//            if(num%i == 0){
//                isDivisible = true;
//                break;
//            }
//        }
//        return num>1 && !isDivisible;
//    }
}
