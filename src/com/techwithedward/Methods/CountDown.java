package com.techwithedward.Methods;

public class CountDown {
    public static void countdown(int n){
        if (n > 0) {
            System.out.println(n + " ");
            countdown(n - 1);
        }
    }

    static void main() {
        countdown(5);
    }
}
