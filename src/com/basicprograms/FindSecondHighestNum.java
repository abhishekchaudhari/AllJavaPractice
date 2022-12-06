package com.basicprograms;

public class FindSecondHighestNum {
    public static void main(String[] args) {
        int[] arr = new int[]{88,5,6,9,2,3,-8,-9,-55,66,66,88};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for(int ele : arr){
            if(ele > highest){
                secondHighest = highest;
                highest = ele;
            }
            if(ele < highest && ele > secondHighest){
                secondHighest = ele;
            }
        }
        System.out.println(secondHighest);
    }
}
