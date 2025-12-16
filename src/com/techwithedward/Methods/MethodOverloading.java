/**
 * With method overloading, multiple methods can have the
 * same name with different parameters
 * Instead of defining two methods that
 * should do the same thing, it is better to overload one.
 */
package com.techwithedward.Methods;

public class MethodOverloading {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    static void main() {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
