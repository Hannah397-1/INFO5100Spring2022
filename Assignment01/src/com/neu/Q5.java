package com.neu;

// Leap Years are any year that can be evenly divided by 4.
// A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.
public class Q5 {
    static boolean isLeapYear(int year) {
        if (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2008));
        System.out.println(isLeapYear(2009));
    }
}
