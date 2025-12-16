package com.techwithedward.Arrays;

public class MultidimensionalArray {
    static void main() {
        int[][] myNumbers = {{1,2,3,4}, {5,6,7,8},{9,10,11,12}};
        myNumbers[2][3] = 23;
        IO.println(myNumbers[2][3]);
        IO.println(myNumbers[2].length);
        IO.println(myNumbers.length);
    }
}
