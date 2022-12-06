package com.basicprograms;

public class test {


    public static void solution() {
        int[] A = new int[]{0,1,1,0,1,1,1,0,1,1,1,1};
        int n = A.length;
        int i = n - 1;
        int result = -1;
        int k = 0, maximal = 0;
        while (i > 0) {
            if (A[i] == 1) {
                k = k + 1;
                if (k >= maximal) {
                    maximal = k;
                    result = i;
                }
            }
            else
                k = 0;
            i = i - 1;
        }
        if (A[i] == 1 && k + 1 > maximal)
            result = 0;

        System.out.println(result);
    }

    public static void main(String[] args) {
        solution();
    }
}