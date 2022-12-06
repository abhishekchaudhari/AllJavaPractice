package com.streams;

public class BiConsumer {
    public static void main(String[] args) {
        java.util.function.BiConsumer<String, Integer> biConsumer = (str, num) -> {
            System.out.println("Hll" + str + num);
        };
        biConsumer.accept("hi", 5);
    }
}
