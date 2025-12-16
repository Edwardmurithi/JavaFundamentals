package com.techwithedward.Methods;

public class RecursionAddRangeOfNumbers {
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    static void main() {
        int result = sum(10);
        IO.println("Range: " + result);
    }
}
