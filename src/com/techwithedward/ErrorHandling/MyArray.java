package com.techwithedward.ErrorHandling;

public class MyArray {
    static void main() {
        try {
            int[] myNumber = {1, 3, 4};
            System.out.println(myNumber[10]);
            int result = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Math Error or Array error occured");
        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array index doesn't exist");
//        } catch (ArithmeticException e) {
//            System.out.println("Cannot divide by zero");
//        } catch (Exception e) {
//            System.out.println("Something else went wrong");
//        }
    }
}
