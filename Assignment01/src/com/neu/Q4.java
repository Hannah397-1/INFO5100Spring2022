package com.neu;

import java.util.Arrays;

public class Q4 {
    // 是否需要考虑大小写字母？？
    static boolean areAnagrams(String str1, String str2){
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        String str1a = String.valueOf(chars1);
        String str2a = String.valueOf(chars2);
        if(str1a.equals(str2a)) return true;
        return false;

    }

    public static void main(String[] args) {
        String str1 = "Afhsid";
        String str2 = "Ahsidf";
        String str3 = "asofua";
        System.out.println(areAnagrams(str1, str2));
        System.out.println(areAnagrams(str1, str3));
    }
}
