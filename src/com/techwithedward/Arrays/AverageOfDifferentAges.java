package com.techwithedward.Arrays;

public class AverageOfDifferentAges {
    static void main() {
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
        float avg, sum = 0;
        int lowestAge = ages[0];
        int highestAge = ages[0];

        // Get the length of the array
        int length = ages.length;
        // Loop through the elements of the array
        for (int age : ages) {
            sum += age;

            if (lowestAge > age) {
                lowestAge = age;
            }
            if (highestAge < age) {
                highestAge = age;
            }
        }
        avg = sum / length;

        IO.println("Sum: " + sum + "\n" +
                "Average: " + avg + "\n" +
                "Highest Age: " + highestAge + "\n" +
                "Lowest Age: " + lowestAge);
    }
}
