package com.techwithedward.The_100_days_of_Java_Challenge;

/**
 * Problem Description: Write a program that checks
 * whether a given integer is a prime number.
 * A prime number is a number greater than 1 that
 * has no divisors other than 1 and itself.
 * Constraints:
 * Input must be an integer.
 * Numbers ≤ 1 are not prime.
 * Logic ( thinking process)
 *      number less than or equal to 1`n not prime
 *      try dividing the number by values from 2 up to n-1
 *      if any division gives remainder 0 `n not prime
 *      if no divide evenly n` prime
 * Pseudocode
 *      START
 *      INPUT Number
 *      IF Number <= 1
 *          PRINT "Not prime"
 *          STOP
 *      END IF
 *
 *      SET isPrime = true
 *
 *      FOR i from 2 to Number - 1
 *          IF Number MOD i == 0
 *              SET isPrime = false
 *              BREAK
 *          END IF
 *     END FOR
 *
 *     IF isPrime == false
 *          PRINT "prime number"
 *     ELSE
 *          PRINT "not prime"
 *     END IF
 *     END
 */

public class Day11 {
    static void main() {
        int num = 7;
        evaluatePrime(num);

    }

    public static boolean isPrime(int num) {
        boolean isNumPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isNumPrime = false;
                break;
            }
        }
        return isNumPrime;
    }

    public static void evaluatePrime(int num) {
        if (num <= 1) {
            System.out.println(num + " is not prime");
            return;
        }

        if (isPrime(num)) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not prime");
        }
    }
}
