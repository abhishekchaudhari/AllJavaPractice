package com.collections;

public class reapetedString {
    public static void main(String[] args) {
        String str = "aabccdeee";
        String remStr = new String();
        for(int i =0; i < str.length(); i++){
            int count = 0;
            for (int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                remStr += str.charAt(i);
            }
        }
        System.out.println(remStr);
    }
}
