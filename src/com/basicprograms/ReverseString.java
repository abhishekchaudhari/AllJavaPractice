package com.basicprograms;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String revStr = new String();
        for(int i = str.length() -1 ; i >=0 ; i--){
            revStr += str.charAt(i);
        }
        System.out.println(revStr);
    }
}
