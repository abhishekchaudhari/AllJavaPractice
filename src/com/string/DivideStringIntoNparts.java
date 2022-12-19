package com.string;

import java.util.ArrayList;
import java.util.List;

public class DivideStringIntoNparts {
    public static void main(String[] args) {
        String str = "abcd";
        int userInput = 2;
        int len = str.length();
        List<String> stringArrayList = new ArrayList<>();

        if(len%userInput != 0){
            System.out.println("Cant divide in same parts");
        } else {
            for(int i=0; i<len; i = i+userInput){
                stringArrayList.add(str.substring(i,i+userInput));
            }
        }
        stringArrayList.stream().forEach(a -> System.out.println(a));
    }
}
