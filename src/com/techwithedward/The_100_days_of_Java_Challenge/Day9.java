package com.techwithedward.The_100_days_of_Java_Challenge;

/**
 * Problem Description: Write a program that reverses the digits of a given integer.
 * Constraints:
 * Input must be an integer.
 * Works for positive and negative numbers.
 * My Approach
 *      Mathematical Approach
 *       --pseudocode
 *          num = 1234
 *          reversed = 0
 *          original = num          // preserve the original value
 *          num = abs(num)          // Handle numbers with negative sign
 *          while num > 0:
 *              digit = num % 10    // Get last digit
 *              reversed = reversed * 10 + digit    // Append digit to reversed
 *              num = num / 10                      // Remove last digit
 *          if original number was negative:
 *              reverse = -reverse
 *          else:
 *              reverse
 */

public class Day9 {
    public static void main(String[] args) {
        int num = -2147;
        int reversed = reverseNumber(num);
        System.out.println("Original: " + num);
        System.out.println("Reversed: " + reversed);

        testReverse();
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        int original = num;

        // Handle negative numbers
        num = Math.abs(num);
        while (num > 0) {
            int digit = num % 10;               // Get last digit
            reversed = reversed * 10 + digit;   // Append digit to reversed
            num = num / 10;                     // Remove the last digit
        }

        // Reapply the sign
        return (original < 0) ? -reversed : reversed;
    }

    public static void testReverse() {
        int[] testCases = {1234, -567, 100, 0, 5, -9, 10, 121, 1000000009};

        System.out.println("\n=====TEST CASES====");
        for (int num : testCases) {
            int reversed = reverseNumber(num);
            System.out.printf("%11d --> %11d%n", num, reversed);
        }
    }
}
