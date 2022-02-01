package com.neu;

import java.util.Arrays;

//Given two strings ransomNote and magazine,
//return true if ransomNote can be constructed from magazine and false otherwise.
//Each letter in magazine can only be used once in ransomNote.
public class Q7 {
    static boolean isConstructed(String ransomNote, String magazine){
        if(ransomNote.length() <= magazine.length()) {
            int i = 0;
            while(i < ransomNote.length()) {
                int j = magazine.indexOf(ransomNote.charAt(i));//找在第几位
                if(j >= 0){
                    magazine = magazine.substring(0,j) +magazine.substring(j+1); //发现有就删除
                    i++;
                }else{
                    return false;//j<0 没找到，false
                }
            }return true;//循环结束 都找到了 true
        }//ransomNote比magazine字母多，false
        return false;
    }

    public static void main(String[] args) {
//        isConstructed("Hello", "Hello World");
        System.out.println(isConstructed("Hello", "Hello World"));
        System.out.println(isConstructed("Hello", "Have a nice day"));
        System.out.println(isConstructed("wofusy","agdsirvwoxcisfsuy"));
    }
}
