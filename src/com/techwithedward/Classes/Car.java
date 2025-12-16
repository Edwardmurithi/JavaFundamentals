package com.techwithedward.Classes;

public class Car {

    String modelName;
    int modelYear;

    public Car(String modelName, int modelYear) {
        this.modelName = modelName;
        this.modelYear = modelYear;
    }

    static  void main() {
        Car car = new Car("Audi", 1996);
        System.out.println(car.modelName + " " + car.modelYear);
    }
}
