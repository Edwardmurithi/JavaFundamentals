package com.techwithedward.Methods;

public class Main {
    static String checkAge(int age) {
        if (age < 18) {
            return "Access Denied, You are not old enough!!";
        } else {
            return "Access Granted, You are old enough!";
        }
    }

    static void main() {
        IO.println(checkAge(12));
        IO.println(checkAge(27));
    }
}