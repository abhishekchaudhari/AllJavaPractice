package com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamSkipLimit {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,28,87,10,20,76,28,80,80,80);
        list.stream().limit(7).forEach(x -> System.out.println(x));

        list.stream().skip(7).forEach(x -> System.out.println("after skip " + x));
    }
}
