package com.techwithedward.Inheritance;

class Vehicle {
    protected String brand = "Ford";        // vehicle attribute
    public void honk() {                    // vehicle method
        System.out.println("tuut, tuut!");
    }
}

public class Car extends Vehicle {
    private String modelName = "Mustang";   // car attribute

    static void main() {
        // create myCar  object
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.modelName + " " + myCar.brand);
    }
}
