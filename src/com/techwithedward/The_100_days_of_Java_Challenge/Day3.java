package com.techwithedward.The_100_days_of_Java_Challenge;

/**
 * Problem Description: Write a program that checks whether a given number is even or odd.
 * @Constraints:
 *    Input must be an integer.
 *    Number can be positive, negative, or zero.
 */

import java.util.Scanner;

public class Day3 {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("num: ");
        int num = scanner.nextInt();

        if(isEven(num)) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}

