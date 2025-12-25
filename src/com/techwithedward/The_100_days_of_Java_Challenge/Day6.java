package com.techwithedward.The_100_days_of_Java_Challenge;

/**
 *Problem Description: Write a program that prints the multiplication
 * table of a given number from 1 to 10.
 *
 * Constraints:
 *
 * Input number must be an integer.
 * Table should go up to num x 10.
 */

public class Day6 {
    public static void main(String[] args) {
        int num = 7;
        // TODO: print multiplication table
        for (int i = 1; i <= 10; i++)
            System.out.println(num + " x " + i + " = " + num * i);
    }
}
