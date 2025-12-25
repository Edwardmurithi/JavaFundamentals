package com.techwithedward.The_100_days_of_Java_Challenge;

/**
 * Problem Description: Write a program that declares variables
 * for your name, age, and country, and prints them in a formatted way
 */
public class Day1 {
    public static void main(String[] args) {
        // TODO: declare variables and print them

        int age = 22;
        String name = "Jane", country = "Kenya";

        if (age > 0) {
            System.out.println("Name: " + name + "\n" + "Age: " + age + "\n" + "Country: " + country);
        } else {
            System.out.println("Enter valid Age");
        }
    }
}

