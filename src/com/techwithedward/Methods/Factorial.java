package com.techwithedward.Methods;

import java.util.Scanner;

public class Factorial {
    public static  int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Value: ");
        int value = scanner.nextInt();

        System.out.println("The factorial of " + value + " is " + factorial(value));
    }
}
