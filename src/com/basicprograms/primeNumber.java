package com.basicprograms;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        if(m == 0 || m == 1){
            System.out.println("Number is not prime");
        }else {
            int n = m/2;
            boolean flag = true;

            for(int i = 2; i <= n; i++){
                if(m%i == 0){
                    System.out.println("Number is not prime");
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("Number is prime");
            }
        }

    }
}
