package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordOccurance {
    public static void main(String[] args) {
        String str = "welcom to code decode and code decode welcome you";
        List<String> stringList = Arrays.asList(str.split(" "));

        Map<String, Long> map = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
