package com.neu;

public class Q5 {
    static boolean isLeapYear(int year){
        if(year%4 == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2008));
        System.out.println(isLeapYear(2009));
    }
}
