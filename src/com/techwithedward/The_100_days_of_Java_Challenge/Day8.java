package com.techwithedward.The_100_days_of_Java_Challenge;

/**
 * Problem Description: Write a program that prints the first n terms
 * of the Fibonacci sequence.
 *
 * Constraints:
 *
 * Input n must be a positive integer.
 * First two terms are 0 and 1.
 */

public class Day8 {
    public static void main(String[] args) {
        int n = 10;
        // TODO: print Fibonacci series
        int first = 0;
        int second = 1;

        if (n < 0) {
            System.out.println("Input must be an integer");
        }

        while (n != 0) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            n--;
        }
    }
}