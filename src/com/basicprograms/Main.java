package com.basicprograms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.solution());
	// write your code here

    }
    public int solution(){
        int[] A = new int[]{1, 3, 6, 4, 1, 2};
        int max = A[0];
        for (int i: A) {
            if(i > max)
                max = i;
        }
        List arrayList = IntStream.of(A).boxed().collect(Collectors.toList());


        for (int i = 1; i<= max; i++){
            if(arrayList.contains(i) == false){
                return i;
            }
        }
        return max+1;
    }
}
