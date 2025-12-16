package com.techwithedward.ErrorHandling;

public class Main {
    static void main() {
        int age = 12;

        if (age < 18) {
            throw new ArithmeticException("Access denied - you're not old enough");
        } else {
            System.out.println("Access granted - You're old enough");
        }
    }
}
