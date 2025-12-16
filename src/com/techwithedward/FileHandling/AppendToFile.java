package com.techwithedward.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    static void main() {
        try(FileWriter myObj = new FileWriter("/home/edward/Desktop/writetofile.txt", true)){
            myObj.append("\nProgramming in Java is very fun.\n");
            System.out.println("Appended to file successfully");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
