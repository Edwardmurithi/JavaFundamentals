package com.techwithedward.The_100_days_of_Java_Challenge;

/**
 * Day 10 – Palindrome Number
 * Problem Description: Write a program that checks whether a given number is a palindrome. (A palindrome reads the same forwards and backwards.)
 * Constraints:
 * Input must be an integer.
 * Works for positive numbers only.
 */

public class Day10 {
    static void main() {
        int num = 121;
        System.out.println(checkPalindrome(num));
    }

    public static int reverseNumber(int num) {
        int reversed = 0;

        while(num > 0) {
            int digit = num % 10;                // Get the last digit
            reversed = reversed * 10 + digit;    // Append digit to reversed
            num = num / 10;                      // Remove last digit
        }
        return reversed;
    }

    public static String checkPalindrome(int num) {
        if (num < 0)
            return num + " is not a palindrome (negative numbers are not palindromes).";

        if (num >= 0 && reverseNumber(num) == num)
            return num + " is palindrome.";
        else
            return num + " is not a palindrome.";
    }
}
