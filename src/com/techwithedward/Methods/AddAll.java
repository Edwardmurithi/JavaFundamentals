package com.techwithedward.Methods;

public class AddAll {
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

    static void main() {
        int result = sum(5, 10);
        System.out.println(result);
    }
}
