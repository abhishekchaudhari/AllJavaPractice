package com.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem {
    public static void main(String[] args) {
        int[] arr  = {1, 2, 0, 0, 0, 3, 0, 6};
        List<Integer> arr2 = new ArrayList<>(arr.length);
        List<Integer> arr3 = new ArrayList<>(arr.length);
        int length = arr.length;
        for(int i =0; i< arr.length; i++){
            if(arr[i] == 0){
                arr3.add(0);
            }else {
                arr2.add(arr[i]);
            }
            if(i == arr.length -1){
                arr2.addAll(arr3);
            }
        }
        arr2.stream().forEach(System.out::print);

    }
}


