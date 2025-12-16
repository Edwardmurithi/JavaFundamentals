package com.techwithedward.Inheritance;

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        super.animalSound(); // call the parent menthod
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        super.animalSound(); // call parent method
        System.out.println("The dog says: bow bow");
    }
}

public class Main {
    static void main() {
        Animal myAnimal = new Animal();     // create Animal object
        Pig myPig = new Pig();        // create Pig object
        Dog myDog = new Dog();       // create Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myPig.animalSound();
    }
}
