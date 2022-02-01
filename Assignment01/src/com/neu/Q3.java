package com.neu;

import java.util.Arrays;

public class Q3 {
    static boolean isDuplicate(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length - 1; i++) {
            if(chars[i] == chars[i+1]){
                return true;
            }continue;
        }return false;
    }

    public static void main(String[] args) {
        String str1 = "sofasu";
        String str2 = "Svoqirh";
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }
}
