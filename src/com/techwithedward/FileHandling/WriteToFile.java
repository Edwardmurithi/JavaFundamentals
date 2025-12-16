package com.techwithedward.FileHandling;

import java.io.FileWriter; // import FileWrite class from io package
import java.io.IOException; // import IOException class.

public class WriteToFile {
    static void main() {
        try (FileWriter obj = new FileWriter("/home/edward/Desktop/writetofile.txt")){
            obj.write("Files in java might be tricky, but it is fun enough!");
            obj.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
