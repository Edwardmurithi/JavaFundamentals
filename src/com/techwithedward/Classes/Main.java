package com.techwithedward.Classes;

public class Main {
    // Main Method
    static void main() {
        Person p = new Person();

        p.setName("James");
        p.setAge(34);

        System.out.println("Name: " + p.getName());
        System.out.println("You are " + p.getAge() + " Years old");
    }
}
