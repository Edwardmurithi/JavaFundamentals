package com.techwithedward.The_100_days_of_Java_Challenge;

/**
 * Problem Description: Write a program to swap two integers without using a third variable.
 * @Constraints:
 *    - Both numbers must be integers.
 *    - Output should display before and after swapping.
 */

public class Day5 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println("Before swap: x=" + x + ", " + "y=" + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swap: x=" + x + ", " + "y=" + y);

    }
}
