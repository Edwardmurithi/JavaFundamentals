package com.techwithedward.The_100_days_of_Java_Challenge;

import java.math.BigInteger;

/**
 * Problem Description: Write a program that calculates the factorial
 * of a given number using a loop.
 *
 * Constraints:
 *
 * Input must be a non-negative integer.
 * Factorial of 0 is 1.
 */

public class Day7 {
    public static void main(String[] args) {
        int num = 30;
        int i = 1;
        int result = 1;

        // TODO: calculate factorial

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers");
            return;
        }

        while (i <= num) {
            result *= i;
            i++;
        }
        System.out.println("Factorial of " + num + " is " + result);
    }

    // Recursive approach
    static int factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Number cannot be negative");
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}