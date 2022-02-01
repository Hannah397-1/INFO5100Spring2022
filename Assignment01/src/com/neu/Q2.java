package com.neu;

import java.util.Arrays;

public class Q2 {
    static boolean uniqueChars(String str){
        //先排序，再比较
        //双指针？？
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length - 1; i++) {
            if(chars[i] == chars[i+1]){
                return false;
            }continue;
        }return true;
    }

    public static void main(String[] args) {
        String str1 = "sofasu";
        String str2 = "Svoqirh";
        System.out.println(uniqueChars(str1));
        System.out.println(uniqueChars(str2));
    }
}
