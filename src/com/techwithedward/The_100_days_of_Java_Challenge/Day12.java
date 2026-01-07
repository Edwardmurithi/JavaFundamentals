package com.techwithedward.The_100_days_of_Java_Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem Description: An Armstrong number of n digits is a number that is
 * equal to the sum of its digits each raised to the power n.
 * Example: 153 = 1³ + 5³ + 3³.
 *
 * Constraints:
 *
 * Input must be a non-negative integer.
 *
 * Algorithm (Logic)
 *      Count number of digits (n)
 *      Extract each digit
 *      Raise each digit to power n
 *      Add results
 *      Compare result with original number
 *
 * Pseudocode:
 *      START
 *      INPUT number
 *      SET temp = number
 *      SET sum = 0
 *      SET digits = 0
 *
 *      IF temp < 1
 *          PRINT "is not armstrong"
 *      END IF
 *
 *      // count digits
 *      WHILE temp != 0
 *          digits++
 *          number = number DIV 10
 *      END WHILE
 *
 *      WHILE temp != 0
 *          SET digit = digit MOD 10
 *          sum = sum + (digit ^ digits)
 *          temp = tem / 10
 *      END WHILE
 *
 *      IF sum == number
 *          PRINT "is Armstrong"
 *      ELSE
 *          PRINT "is not Armstrong"
 *      END IF
 *      END
 *
 *
 * */

public class Day12 {
    public static void main(String[] args) {
        int num = 371;

        if (num < 1) {
            System.out.println(num + " is not Armstrong");
            return;
        }

        if (isArmstrong(num))
            System.out.println(num + " is an Armstrong");
        else
            System.out.println(num + " is not Armstrong");

        System.out.println("\n----------ARMSTRONG VALUES WITHIN 1 - 10000 ----------");
        testArmstrong();
    }

    public static int digits(int num) {
        int n = 0;
        while (num != 0) {
            n = n + 1;
            num = num / 10;
        }
        return n;
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;           // get last digit
            sum = sum + Math.powExact(digit, digits(original));
            num = num / 10;
        }
        return sum == original;
    }

    public static void testArmstrong() {
        ArrayList<Integer> armstrongValues = new ArrayList<Integer>();

        for (int i = 1; i <= 10000; i++) {
            if (isArmstrong(i)) {
                armstrongValues.add(i);
            }
        }
        System.out.println(Arrays.toString(armstrongValues.toArray()));
    }
}
