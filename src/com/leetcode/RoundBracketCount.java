package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RoundBracketCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=0;
        for(int i=0; i< s.length() -1; i++){
            if(String.valueOf(s.charAt(i)).contains("(") && String.valueOf(s.charAt(i+1)).contains(")"))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
