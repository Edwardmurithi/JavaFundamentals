package com.techwithedward.working_with_java;

public class Main {

    // static factory method
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

    static void main(String[] args) {
        System.out.printf(String.valueOf(valueOf(true)));
    }
}
