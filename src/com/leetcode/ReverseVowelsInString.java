package com.leetcode;

public class ReverseVowelsInString {
    public static void main(String[] args) {
        reverseVowels("hello world");
    }
    public static void reverseVowels(String s){
        String str = "";
        String vowels = "aeiou";
        for(int i = s.length() - 1; i>=0; i--){
            if(vowels.contains(String.valueOf(s.charAt(i))))
                str += s.charAt(i);
        }
        int j =0;
        String otherString ="";
        for(int i = 0; i< s.length(); i++){
            if(vowels.contains(String.valueOf(s.charAt(i)))){
                otherString += str.charAt(j);
                j++;
            }else {
                otherString += s.charAt(i);
            }
        }
        System.out.println(otherString);
    }
}
