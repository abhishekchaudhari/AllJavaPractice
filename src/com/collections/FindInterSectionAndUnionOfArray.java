package com.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindInterSectionAndUnionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {80, 10, 15, 2, 35, 60};
        int[] arr2 = {35, 80, 60, 20, 75};
        FindInterSectionAndUnionOfArray interSectionAndUnionOfArray = new FindInterSectionAndUnionOfArray();
        interSectionAndUnionOfArray.printInterSection(arr1, arr2);
        interSectionAndUnionOfArray.printUnion(arr1,arr2);


    }
    void printInterSection(int[] arr1, int[] arr2){
        Set<Integer> s = new HashSet<>();

        Arrays.stream(arr1).forEach(ele -> s.add(ele));
        Arrays.stream(arr2).filter(ele -> s.contains(ele)).forEach(ele -> System.out.println(ele));
    }
    void printUnion(int[] arr1, int[] arr2){
        Set<Integer> s = new HashSet<>();

        Arrays.stream(arr1).forEach(ele -> s.add(ele));
        Arrays.stream(arr2).forEach(ele -> s.add(ele));
        System.out.println("Union elements:");
        s.stream().forEach(System.out::println);
    }
}
