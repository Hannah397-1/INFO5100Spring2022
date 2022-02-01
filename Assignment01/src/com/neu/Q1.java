package com.neu;

public class Q1 {
    static boolean isPalindrome(String str) {
        int indexBegin = 0;
        int indexEnd = str.length() - 1;
        while (indexBegin < indexEnd) {
            if(str.charAt(indexBegin) != str.charAt(indexEnd)){
                return false;
            }
            indexBegin++;
            indexEnd--;
        }return true;
    }

    public static void main(String[] args) {
        String str1 = new String("qeggeq");
        String str2 = new String("grge");
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));

    }
}


