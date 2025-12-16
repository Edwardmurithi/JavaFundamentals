package com.techwithedward.Abstraction;

abstract class Animal {
    // abstract method (does not have a body)
    public abstract void animalSound();
    // regular method
    public void sleep() {
        System.out.println("Zzzz");
    }
}

// subclass (inherits from Animal)
class Pig extends Animal {
    // The body of the animalSound() is provided here
    public void animalSound() {
        System.out.println("The animal says: wee wee!");
    }
}

public class Main {
    static void main() {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
