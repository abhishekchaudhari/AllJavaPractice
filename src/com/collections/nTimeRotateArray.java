package com.collections;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class nTimeRotateArray {
    public static void main(String[] args){
        List<Integer> arrList = new ArrayList<>(List.of(1,2,3,4,5));
        int n = 2;
        for(int i=0; i<n; i++){
            int first, j;
            first = arrList.get(0);
            for(j=0; j< arrList.size() -1; j++){
                arrList.set(j, arrList.get(j+1));
            }
            arrList.set(j, first);
        }
        List<Integer> arr2 = new ArrayList<>();
        arrList.forEach(integer -> {integer+=100; System.out.println(integer);});
        arrList.stream().forEach(integer -> {integer += 1000; System.out.println(integer);});
    }
}
