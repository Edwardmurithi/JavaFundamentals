package com.techwithedward.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    static void main() {
        try {
            File createFile = new File("/home/edward/Desktop/filename.txt"); // create file object
            if (createFile.createNewFile()) {   //try to create a file
                System.out.println("File created: " + createFile.getName());
            } else {
                System.out.println("File already Exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();    //print error details
        }

    }
}
