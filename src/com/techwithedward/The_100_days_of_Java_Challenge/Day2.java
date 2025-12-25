package com.techwithedward.The_100_days_of_Java_Challenge;
/**
 * Problem Description: Write a program that takes two integers and calculates their:
 * Sum
 * Difference
 * Product
 * Quotient
 */

import java.util.Scanner;

public class Day2 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int difference(int a, int b) {
        return a - b;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static int quotient(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        // TODO: print sum, difference, product, and quotient
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        int a = scanner.nextInt();

        System.out.print("b: ");
        int b = scanner.nextInt();

        System.out.println("\nSum: " + sum(a, b));
        System.out.println("Difference: " + difference(a,b));
        System.out.println("Product: " + product(a,b));
        System.out.println("Quotient: " + quotient(a,b));
    }
}

