package com.techwithedward.The_100_days_of_Java_Challenge;

/**
 * Problem Description: Write a program to find the largest among three integers.
 * @Constraints:
 *    - All three numbers must be integers.
 *    - Numbers can be equal.
 */

public class Day4 {
    static int findMax(int a, int b, int c) {
//        int[] arr = {a, b, c};
//        int max = arr[0];
//
//        for(int element : arr) {
//            if (element > max) {
//                max = element;
//            }
//        }
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }
    public static void main(String[] args) {
        int a = 12, b = 25, c = 10;
        System.out.println("Maximum: " + findMax(a,b,c));
    }
}

