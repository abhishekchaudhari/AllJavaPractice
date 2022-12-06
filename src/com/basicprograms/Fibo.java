package com.basicprograms;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(0);
        System.out.println(1);
        printFibo(a-2);
    }
    static int n1=0 , n2 =1, n3 = 0;
    public static void printFibo(int count){
        if(count > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            printFibo(count - 1);
        }
    }
}
